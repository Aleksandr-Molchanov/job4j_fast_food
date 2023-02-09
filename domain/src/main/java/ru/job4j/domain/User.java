package ru.job4j.domain;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private int id;

    private String username;

    private String password;

    private double balance;

    private String location;

    private List<Notification> notifications;
}
