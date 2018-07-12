package org.yx.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 杨欣 on 2018/7/12.
 */
@FeignClient(value = "HELLO-SERVICE")
public interface FeignHelloService {
    @RequestMapping("/hello")
    String hello();
}
