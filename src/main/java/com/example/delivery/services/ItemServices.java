package com.example.delivery.services;

import com.example.delivery.entities.Item;

public interface ItemServices {
    Item createItem(Item item);

    void deleteItem(Long id);
}
