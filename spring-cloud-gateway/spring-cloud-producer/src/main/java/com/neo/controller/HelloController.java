package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author afj
 */
@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index() {
        System.out.println("producer 01 hell world");
        return "hello world!";
    }

    @RequestMapping("/p1")
    public String foo(String p1) {
        System.out.println("producer 01 hell " + p1);
        return "hello "+p1+"!";
    }

}