package ru.job4j.dish.service;

import ru.job4j.domain.Dish;
import ru.job4j.domain.Product;

import java.util.List;
import java.util.Optional;

public interface DishService {

    void save(Dish dish);

    void delete(Dish dish);

    Optional<Dish> findById(int id);

    Optional<Dish> findByName(String name);

    List<Dish> findAll();

    List<Dish> findAllProductFree(Product product);
}
