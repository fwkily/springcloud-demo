package com.fwkily.consumerdemo.controller;


import com.fwkily.domain.dto.UserDTO;
import com.fwkily.domain.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer2Controller {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer2/demo")
    public String consumerdemo(){
        return this.restTemplate.getForObject("http://provider-demo:7900/provider/demo",String.class);
    }

    @PostMapping(value = "/user/add")
    public String addUser(@RequestBody UserDTO dto){
        UserVO vo = new UserVO();
        BeanUtils.copyProperties(dto,vo);
        return "我是" + vo.getName() + ",我今年" + vo.getAge() +  "岁了！";
    }



}
