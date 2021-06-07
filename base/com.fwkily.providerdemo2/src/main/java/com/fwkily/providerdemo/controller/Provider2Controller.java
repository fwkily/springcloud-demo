package com.fwkily.providerdemo.controller;


import com.fwkily.domain.dto.UserDTO;
import com.fwkily.providerdemo.feign.HelloServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Provider2Controller {

    @Autowired
    private HelloServiceFeign helloServiceFeign;

    @GetMapping("/provider2/demo7")
    public String provider(@RequestParam("name") String name){
        return "hello,I am " + name + "!";
    }

    @PostMapping(value = "/provider2/testPost")
    public String testPost(){
        return null;
    }




    @PostMapping(value = "/user/add")
    public String addUser(@RequestBody UserDTO dto){
        return helloServiceFeign.addUser(dto);
    }


}
