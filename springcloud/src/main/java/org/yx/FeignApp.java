package org.yx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yx.service.FeignHelloService;

/**
 * Created by 杨欣 on 2018/7/12.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class FeignApp {
    @Autowired
    private FeignHelloService feignHelloService;
    public static void main(String[] args){
        SpringApplication.run(FeignApp.class, args);
    }
    @RequestMapping("/feign-consumer")
    public String hello(){
        return feignHelloService.hello();
    }
}
