package com.example.microservice.user_ms.model;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Qualifier("eurekaClient")
    @Autowired
    EurekaClient eurekaClient;

    @GetMapping("/user/{id}")
    ResponseEntity<UserEntity> getUserById(@PathVariable Integer id) {
        UserEntity ue = userRepository.findById(id).get();
        return new ResponseEntity<>(ue, HttpStatus.OK);
    }

    @GetMapping("/user/posts/{userid}")
    ResponseEntity<Object> getMessage(@PathVariable Integer userid) {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("post_microservice", false);
        String baseUrl = instanceInfo.getHomePageUrl();

        ResponseEntity responseEntity = restTemplate.getForEntity(baseUrl + "/post/user/" + userid, Object.class);

        return responseEntity;
    }
}
