package com.example.delivery.services;

import java.util.List;

import com.example.delivery.entities.Item;

public interface ItemServices {
    Item createItem(Item item);

    Item getItemById(Long id);

    List<Item> getAllItems();
 
    void deleteItem(Long id);

}
