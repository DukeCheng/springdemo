package me.feinian.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {
    //请求映射,当请求 /main/test 时执行该方法
    @RequestMapping("/test")
    public String home() {
        return "Hello Main!";
    }
}
