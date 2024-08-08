package com.tharunda.SimpleWeb.service;

import com.tharunda.SimpleWeb.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    @Component
    public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"IPhone",50000),
            new Product(102,"Canon",150000),
            new Product(103,"Sony",180000)));

            public List<Product> getProducts(){

                return products;
            }

        public Product getProductById(int prodId) {
                return products.stream()
                        .filter(p -> p.getProdId() == prodId)
                        .findFirst().orElse(new Product(100,"No item",0));
        }

        public void addProduct(Product prod){

                products.add(prod);

        }

    }
