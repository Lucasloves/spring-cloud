package com.hxh.invoker1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InvokerController {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate rest() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/invoker1", method = RequestMethod.GET)
    public String invoker1(){
        String data = restTemplate.getForObject("http://service-provider1/provider1?id=2019", String.class);
        return data;
    }

}
