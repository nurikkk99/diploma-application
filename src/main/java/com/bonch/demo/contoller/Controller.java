package com.bonch.demo.contoller;

import com.bonch.demo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping
    public String getResponse(@RequestParam (value = "string") String string)
            throws InterruptedException {
        return service.processString(string);
    }

    @GetMapping("/test")
    public String getResponseTest() {
        return service.test();
    }
}
