package org.yx;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by 杨欣 on 2018/7/25.
 */
@SpringBootConfiguration
@EnableConfigServer
public class CloudConfigApp {
    public static void main(String[] args){
        new SpringApplicationBuilder(CloudConfigApp.class).web(true).run(args);
    }
}
