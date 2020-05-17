package cn.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {

//要通过SpringBoot提供的引导类起步SpringBoot才可以进行访问
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);

    }
}
