package org.example.learn.spring.boot.session.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("/session")
public class SessionController {

    @RequestMapping("/hello")
    public String hello() {
        Date now = Calendar.getInstance().getTime();
        return "hello world" + " at " + now.toGMTString();
    }
}
