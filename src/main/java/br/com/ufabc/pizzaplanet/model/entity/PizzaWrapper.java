package br.com.ufabc.pizzaplanet.model.entity;

import java.util.List;

public class PizzaWrapper {

    List<Pizza> pizzas;

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
}
