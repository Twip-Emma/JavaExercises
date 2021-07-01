package com.example.javaweb.function;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Try1 {
    @GetMapping("/www")
    @CrossOrigin
    public String www()
    {
//        String msg = new Try2().Try2();
        return "msg";
    }
}
