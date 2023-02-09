package ru.job4j.domain;

import lombok.Data;

import java.util.List;

@Data
public class Order {

    private int id;

    private List<Dish> dishes;

    private double totalPrice;

    private boolean paymentStatus;

    private boolean acceptStatus;

}
