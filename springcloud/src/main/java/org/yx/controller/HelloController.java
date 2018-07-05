package org.yx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 杨欣 on 2018/7/4.
 */
@RestController
public class HelloController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String index(){
        return "hello kitty";
    }
}
