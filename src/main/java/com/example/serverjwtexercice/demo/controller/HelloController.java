package com.example.serverjwtexercice.demo.controller;

import com.example.serverjwtexercice.demo.controller.models.Post;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


@RestController
public class HelloController {


    @GetMapping(path = "/get-movies-synopsis")
    public ResponseEntity<List<Post>> getMoviesSynopsis() throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        BufferedReader body = new BufferedReader(new InputStreamReader(http.getInputStream()));
        Type JSON_FORMAT = new TypeToken<List<Post>>(){}.getType();
        List<Post> posts = new Gson().fromJson(body, JSON_FORMAT);
        return new ResponseEntity<List<Post>>( posts, HttpStatus.OK);
    }
}
