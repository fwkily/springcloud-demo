package com.fwkily.consumerdemo.controller;


import com.fwkily.consumerdemo.feign.UserServiceFeign;
import com.fwkily.domain.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @PostMapping(value = "/user/add",consumes = {"application/json"})
    public String addUser(@RequestBody UserDTO dto){
        return userServiceFeign.addUser(dto);


    }



}
