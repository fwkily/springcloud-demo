package com.fwkily.consumerdemo.feign;


import com.fwkily.domain.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "provider-demo",url = "http://localhost:7900",decode404 = true)
public interface UserServiceFeign {


    @PostMapping(value = "/user/add")
    String addUser(UserDTO dto);

}
