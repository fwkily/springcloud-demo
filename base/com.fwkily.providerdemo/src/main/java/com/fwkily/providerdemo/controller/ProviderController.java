package com.fwkily.providerdemo.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {


    @GetMapping("/provider/demo")
    public String provider(){
        return "hello,I am provider11111111111111111!";
    }

    @GetMapping("/provider/{name}")
    @HystrixCommand(fallbackMethod = "getNameFallback")
    public String provider(@PathVariable("name") String name){
        if("fwk".equals(name)){
            return new StringBuilder().append("我是").append(name).toString();
        }else {
            throw new RuntimeException("名字不合法！");
        }

    }

    /**
     * 参数不能为空，不然会报错
     * @param name
     * @return
     */
    public String getNameFallback(String name){
        return "this name is not exit!";
    }



}
