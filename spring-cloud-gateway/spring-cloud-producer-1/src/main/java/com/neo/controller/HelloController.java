package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author afj
 */
@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index() {
        System.out.println("producer 02 hello world smile!");
        return "hello world smile!";
    }

    @RequestMapping("/p2")
    public String foo(String p2) {
        System.out.println("producer 02 hell " + p2);
        return "hello "+p2+"!!";
    }
}