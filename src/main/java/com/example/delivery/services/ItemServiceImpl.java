package com.example.delivery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.delivery.entities.Item;
import com.example.delivery.repositories.ItemRepository;

@Service
public class ItemServiceImpl implements ItemServices {

    private ItemRepository itemRepository;
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long id) {
        return itemRepository.findById(id).get();
    }

}
