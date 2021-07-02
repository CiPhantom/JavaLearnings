package com.example.demo.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Integer> {
    Optional<List<Post>> findAllByUserId(Integer userid);
}
