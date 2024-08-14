package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    HashMap<String, Integer> items;

    public Basket(){
        this.items = new HashMap<>();
        this.items.put("Something", 20);
        this.items.put("Some2", 30);
    }

    public Boolean add(String product, int price){
        return !items.containsKey(product);
    }

    public Integer total(){
        int total = 0;
        for (Map.Entry<String, Integer> set : items.entrySet()){
            total+=set.getValue();
        }
        return total;
    }
}
