//package com.fwkily.consumerdemo.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//@RestController
//public class ConsumerController {
//
//
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//
//
//    @GetMapping("/consumer/demo")
//    public String consumerdemo(){
//        return this.restTemplate.getForObject("http://provider-demo:7900/provider/demo",String.class);
//    }
//
//    @GetMapping("/consumer/getInterfaceInfo")
//    public void getInterfaceInfo(){
//        ServiceInstance instance = loadBalancerClient.choose("provider-demo");
//        System.out.println(instance.getPort());
//    }
//
//}
