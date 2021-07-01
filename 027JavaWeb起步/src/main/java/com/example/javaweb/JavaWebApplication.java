package com.example.javaweb;

import com.example.javaweb.function.HelloWorld;
import com.example.javaweb.function.Try2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public abstract class JavaWebApplication {

    public static void main(String[] args) {
//        new HelloWorld().HelloWorld();
        Try2 msg = new Try2();
        msg.Start();
//        SpringApplication.run(JavaWebApplication.class, args);
    }
}
