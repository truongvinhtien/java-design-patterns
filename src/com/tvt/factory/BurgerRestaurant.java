package com.tvt.factory;

public class BurgerRestaurant implements FoodRestaurant {
    @Override
    public String serve() {
        return "Burger";
    }
}
