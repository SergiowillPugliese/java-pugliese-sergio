package org.engim.springexample.controller;
import java.util.concurrent.atomic.AtomicLong;

import org.engim.springexample.model.Saluto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalutoController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Saluto greeting(@RequestParam(value = "nome", defaultValue = "World") String name) {
        return new Saluto(counter.incrementAndGet(), String.format(template, name));
    }
}
