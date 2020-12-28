package com.examplebycoursera.courserademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class SimpleController {

    @RequestMapping("/")

    public String index() {

        return "Hello World";

    }


}
