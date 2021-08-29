package com.platform.autotest.controller;

import com.platform.autotest.bean.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    private Map<String, Object> params = new HashMap<>();

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/save_user")
    public Object saveUser(User user) {
        params.clear();
        params.put("user", user);
        return params;
    }


    @GetMapping("/{city_id}/{user_id}")
    public Map<String, Object> findObject(@PathVariable("city_id") String city_id, @PathVariable("user_id") String user_id) {
        params.clear();
        params.put("user_id", user_id);
        params.put("city_id", city_id);
        return params;
    }

    @GetMapping(value = "/list_limit")
    public Object listLimit(@RequestParam(defaultValue = "0", name = "page") int page, @RequestParam(defaultValue = "10", name = "size") int size) {
        params.clear();
        params.put("page", page);
        params.put("size", size);
        return params;
    }
}
