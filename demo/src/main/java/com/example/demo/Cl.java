package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lidashuang
 * @version 1.0
 */
@Component
@RestController
@RequestMapping("/a")
public class Cl {

    private final TestRepository repository;

    public Cl(TestRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("")
    public String a() {
        return ">>>>>>>" + repository.findAll().toString();
    }

}
