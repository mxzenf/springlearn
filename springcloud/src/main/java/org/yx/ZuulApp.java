package org.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by 杨欣 on 2018/7/18.
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApp {
    public static void main(String[] args){
        new SpringApplicationBuilder(ZuulApp.class).web(true).run(args);
    }
}
