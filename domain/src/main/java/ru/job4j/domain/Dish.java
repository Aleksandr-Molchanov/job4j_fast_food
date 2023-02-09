package ru.job4j.domain;

import lombok.Data;

import java.util.Set;

@Data
public class Dish {

    private int id;

    private String name;

    private String description;

    private Set<Product> composition;

    private double price;
}
