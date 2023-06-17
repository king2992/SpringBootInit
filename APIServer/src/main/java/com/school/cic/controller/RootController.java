package com.school.cic.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController { 
    @GetMapping("/getList")
    public List<String> getList() {
        return Arrays.asList("Item1", "Item2", "Item3");
    }
}
