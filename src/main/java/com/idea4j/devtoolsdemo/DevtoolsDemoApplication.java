package com.idea4j.devtoolsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DevtoolsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevtoolsDemoApplication.class, args);
    }

    @RestController
    public class DemoController{

        @RequestMapping("/")
        public String hello() {
            return "hello wrld\n";
        }
    }

}
