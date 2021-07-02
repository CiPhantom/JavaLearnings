package com.example.demo;

import com.example.demo.model.Post;
import com.example.demo.model.PostRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoApplication {

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return (args) -> {
/*			postRepository.deleteAll();
			URL url = new URL("https://jsonplaceholder.typicode.com/posts");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			Type type = new TypeToken<ArrayList<Post>>(){}.getType();
			BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String response = br.lines().collect(Collectors.joining());
			List<Post> posts = new Gson().fromJson(response, type);
			for(Post p : posts) {
				postRepository.save(p);
			}*/
		};
	}
}
