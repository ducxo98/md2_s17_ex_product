package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProducService{
    public static Map<Integer, Product > productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"samsung",20,"dien thoai thong minh","han quoc"));
        productMap.put(2,new Product(2,"iphone",30,"dien thoai tao ","usa"));
        productMap.put(3,new Product(3,"oppo",25,"dien thoai nhai  ","china"));
    }
    @Override
    public List<Product>findAll(){
        return new ArrayList<>(productMap.values());
    }
}
