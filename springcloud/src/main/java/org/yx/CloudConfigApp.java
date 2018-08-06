package org.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by 杨欣 on 2018/7/25.
 */
@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigApp {
    public static void main(String[] args){
        new SpringApplicationBuilder(CloudConfigApp.class).run(args);
    }
}
