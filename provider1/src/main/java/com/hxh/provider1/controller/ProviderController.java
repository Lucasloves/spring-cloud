package com.hxh.provider1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping(value = "/provider1", method = RequestMethod.GET)
    public String provider1(@RequestParam("id") int id){
        System.out.println("id: " + id);
        return  "id: " + id;
    }

}
