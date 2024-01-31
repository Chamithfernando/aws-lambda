package com.aws.lambda.lambdademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/lambda")
public class DemoController {

    @GetMapping("/test")
    public String sayHello(){
        return "Hello Chamith this is lambda basic test";
    }
}
