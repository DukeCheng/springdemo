package me.feinian.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


//@ComponentScan
//@SpringBootConfiguration
//@EnableAutoConfiguration
@RestController
@ComponentScan({"me.feinian.test", "me.feinian.login"})
@SpringBootApplication

public class App extends SpringBootServletInitializer {
    public static void main(String[] args) {
        //启动 Web 容器
        SpringApplication.run(App.class, args);
        System.out.println("[启动成功]" + new Date());
    }
}
