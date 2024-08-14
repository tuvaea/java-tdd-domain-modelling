package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class BasketTest {
    HashMap<String, Integer> items;

    public BasketTest(){
        this.items = new HashMap<>();
        this.items.put("Something", 20);
        this.items.put("Some2", 30);
    }

    @Test
    public void testItemInBasket(){
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("new", 40));
        Assertions.assertFalse(basket.add("Some2", 30));
    }

    @Test
    public void testTotal(){
        Basket basket = new Basket();
        int total=basket.total();
        Assertions.assertEquals(50, total);
    }
}
