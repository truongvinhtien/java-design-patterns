package com.tvt.factory;

import java.util.Objects;

public class RestaurantFactory {
    public FoodRestaurant getRestaurant(String type) {
        if (Objects.isNull(type)) {
            return null;
        }
        if (type.equals("Burger")) {
            return new BurgerRestaurant();
        }
        if (type.equals("Steak")) {
            return new SteakRestaurant();
        }
        return null;
    }
}
