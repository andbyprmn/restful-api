package com.homecredit.restfulapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
    public String sayHello() {
        return "Scenario Test 01 Home Credit Indonesia";
    }

}
