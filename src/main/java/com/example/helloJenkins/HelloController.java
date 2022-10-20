package com.example.helloJenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Hello hello;

    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name) {
        return hello.print(name);
    }

    @GetMapping("/")
    String home() {
        return "Jenkins 너무 신기해요 ~!";
    }
}
