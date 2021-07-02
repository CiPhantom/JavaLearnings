package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "post")
public class Post {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "userid")
    private Integer userId;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;
}
