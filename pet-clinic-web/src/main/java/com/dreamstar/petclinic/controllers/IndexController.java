package com.dreamstar.petclinic.controllers;
/*

ID: IndexController.java
Author: Sam

*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
