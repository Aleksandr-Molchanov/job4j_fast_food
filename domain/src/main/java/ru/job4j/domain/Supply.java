package ru.job4j.domain;

import lombok.Data;

import java.util.Set;

@Data
public class Supply {

    private int id;

    private Set<Product> products;

    private double total;

    boolean paymentStatus;

    boolean doneStatus;

}
