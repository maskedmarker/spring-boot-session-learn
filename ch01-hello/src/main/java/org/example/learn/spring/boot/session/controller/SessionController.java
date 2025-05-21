package org.example.learn.spring.boot.session.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/session")
public class SessionController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) {
        Date now = Calendar.getInstance().getTime();

        Map<String, Object> data = new HashMap<>();
        data.put("timestamp", now.toString());
        data.put("name", "zhangsan");

        request.getSession().setAttribute("data", data);


        return "hello world" + " at " + now.toGMTString();
    }
}
