package ru.job4j.domain;

import lombok.Data;

import java.util.List;

@Data
public class Customer {

    private int id;

    private String name;

    private String surname;

    private String address;

    private String phoneNumber;

    private List<Notification> notifications;
}
