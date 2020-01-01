package com.dreamstar.petclinic.controllers;
/*

ID: OwnerController.java
Author: Sam

*/

import com.dreamstar.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/owners")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping(value = {"","/index","/index.html"})
    public String listVets(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
