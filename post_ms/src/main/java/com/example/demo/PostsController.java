package com.example.demo;

import com.example.demo.model.Post;
import com.example.demo.model.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

    @Autowired
    PostRepository postRepository;

    @Value("${service.instance.name}")
    String instanceName;

    @GetMapping("/post/{id}")
    ResponseEntity<Post> getPostById(@PathVariable Integer id) {
        Post p = postRepository.findById(id).get();
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @GetMapping("/post/user/{userid}")
    ResponseEntity<List<Post>> getPostByUserId(@PathVariable Integer userid) {
        List<Post> p = postRepository.findAllByUserId(userid).get();
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @GetMapping("/hello/instance")
    String getHelloInstance() {
        return "Hello from : " + this.instanceName;
    }

}
