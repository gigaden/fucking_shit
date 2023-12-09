package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/index")
    public String doSomeThing(Model model, @RequestParam(value="name", required=false) String name) {
        model.addAttribute("name", name);
        return "index.html";
    }

    @GetMapping("/index/hello2/{name}")
    public String doSomeThing2(Model model, @PathVariable(value="name") String name) {
        model.addAttribute("name", name);
        return "index.html";
    }
}
