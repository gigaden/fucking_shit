package com.example.demo.services;

import com.example.demo.entities.Item;
import com.example.demo.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemsService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemsService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

//    @Autowired
//    public void setItemRepository(ItemRepository itemRepository) {
//        this.itemRepository = itemRepository;
//    }
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

}
