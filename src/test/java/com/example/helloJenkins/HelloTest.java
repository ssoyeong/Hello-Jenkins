package com.example.helloJenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    private Hello hello = new Hello();

    @Test
    public void testHello() {
        assertEquals("hello soyeong", hello.print("soyeong"));
    }

}
