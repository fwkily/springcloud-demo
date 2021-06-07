package com.fwkily.providerdemo.controller;

import com.fwkily.domain.dto.UserDTO;
import com.fwkily.providerdemo.feign.HelloServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private HelloServiceFeign feign;


    @GetMapping("/demo/getHost")
    public String getHost(@RequestParam("name") String name){
        return feign.provider(name);
    }


    @PostMapping(value = "/user/add")
    public String addUser(@RequestBody UserDTO dto){
        return feign.addUser(dto);
    }

}
