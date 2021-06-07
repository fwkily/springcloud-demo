package com.fwkily.providerdemo.feign;


import com.fwkily.domain.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "consumer-demo2",url = "http://localhost:7911",decode404 = true)
public interface HelloServiceFeign {

    @PostMapping(value = "/user/add")
    public String addUser(@RequestBody UserDTO dto);


}
