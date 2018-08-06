package org.yx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 杨欣
 * 2018-06-30
 */
@SpringBootApplication
//@EnableEurekaServer
public class App
{
    public static void main( String[] args )
    {

        new SpringApplicationBuilder(App.class).web(true).run(args);
    }
}
