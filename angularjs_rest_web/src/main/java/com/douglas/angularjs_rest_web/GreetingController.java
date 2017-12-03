package com.douglas.angularjs_rest_web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //enable cross-origin requests only for this specific method
    @CrossOrigin(origins = "http://localhost:9000")
    //shortcut for @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(required=false, defaultValue = "World") String name) {
        System.out.println("=== in greeting ===");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/greeting-javaconfig")
    public Greeting greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
