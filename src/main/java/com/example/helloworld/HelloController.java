package com.example.helloworld;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {



        @GetMapping("/hello")
        public String hello() {
            return "hello"; // this will map to /WEB-INF/jsp/hello.jsp
        }
    }





