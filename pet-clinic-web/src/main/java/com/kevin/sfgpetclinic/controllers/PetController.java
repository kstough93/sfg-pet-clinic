package com.kevin.sfgpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class PetController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOfOwners() {
        return "owners/index";
    }
}
