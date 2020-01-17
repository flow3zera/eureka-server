package com.example.eurekaproducer;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${config.producer.instance:0}")
    private int instance;

    @Value("${server.port}")
    String port;

    @GetMapping("/")
    public String hello(@RequestParam String name) {
        return  "[" + instance + "]" + "Hello, " + name + " " + "port: " + port +" " + new Date();
    }

}
