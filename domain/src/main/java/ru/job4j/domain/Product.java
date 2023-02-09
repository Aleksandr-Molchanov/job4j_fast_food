package ru.job4j.domain;

import lombok.Data;

@Data
public class Product {

    private int id;

    private String name;

    private String description;

    private double price;
}
