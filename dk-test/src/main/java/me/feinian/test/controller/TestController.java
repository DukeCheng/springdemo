package me.feinian.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    //请求映射，当请求 /home 时执行该方法
    @RequestMapping("/test")
    public String home() {
        return "Hello Test!";
    }
}
