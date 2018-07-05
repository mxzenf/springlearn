package org.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by 杨欣 on 2018/7/4.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloApp {
    public static void main(String[] args){
        SpringApplication.run(HelloApp.class, args);
    }
}
