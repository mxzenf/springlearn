package org.yx.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 杨欣 on 2018/7/10.
 * Hystrix通过对不同的service创建不同的线程池进行服务隔离
 * 好处是不同服务分级隔离不会相互产生影响
 * 坏处是过多的线程池损失了系统部分性能
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(defaultFallback = "helloback",ignoreExceptions = {IllegalStateException.class})
    public String helloService(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
    }

    /**
     * 服务降级
     * @return
     */
    public String helloback(){
        return "error";
    }
}
