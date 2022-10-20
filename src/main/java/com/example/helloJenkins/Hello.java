package com.example.helloJenkins;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class Hello {

    @Cacheable
    public String print(String name) {
        return "hello " + name;
    }
}
