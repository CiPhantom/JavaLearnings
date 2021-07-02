package com.example.microservice.user_ms.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
public class UserEntity {

    @Id
    private Integer id;

    private String name;

    private String email;

    private String phone;

    public UserEntity(){}

    public UserEntity(Integer id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
