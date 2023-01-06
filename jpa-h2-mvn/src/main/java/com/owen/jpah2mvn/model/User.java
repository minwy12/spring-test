package com.owen.jpah2mvn.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    public User() {

    }

    public User(String nsme) {
        this.name = name;
    }
}
