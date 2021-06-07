package com.fwkily.providerdemo.feign;


import com.fwkily.domain.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider-demo2",url = "http://localhost:7901",decode404 = true)
public interface HelloServiceFeign {

    @GetMapping("/provider/demo7")
    public String provider(@RequestParam("name") String name);


    @PostMapping(value = "/user/add")
    public String addUser(@RequestBody UserDTO dto);


}
