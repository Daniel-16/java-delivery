package com.example.delivery.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.delivery.entities.Item;
import com.example.delivery.services.ItemServices;

public class ItemController {
    private final ItemServices itemServices;

    public ItemController(ItemServices itemServices) {
        this.itemServices = itemServices;
    }

    @PostMapping("/create-item")
    ResponseEntity<Item> createItem(@RequestBody Item item) {
        Item newItem = itemServices.createItem(item);
        return ResponseEntity.ok(newItem);
    }
}
