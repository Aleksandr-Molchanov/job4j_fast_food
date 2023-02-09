package ru.job4j.domain;


import lombok.Data;

@Data
public class Delivery {

    private int id;

    private Customer customer;

    private Order order;

    private User courier;

    private boolean doneStatus;
}
