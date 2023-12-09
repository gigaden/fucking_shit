package com.example.demo.controllers;

import com.example.demo.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    private final ItemsService itemsService;

//    @Autowired
//    public void setItemsService(ItemsService itemsService) {
//        this.itemsService = itemsService;
//    }

    @Autowired
    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @GetMapping
    public String showItemsPage (Model model) {
        model.addAttribute("items", itemsService.getAllItems());
        return "items.html";
    }
}
