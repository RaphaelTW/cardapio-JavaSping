package com.example.cardapio.controller;

import com.example.cardapio.CardapioApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")
public class FoodController {
    public void main(String[] args){
        SpringApplication.run(CardapioApplication.class, args);

    }
}
