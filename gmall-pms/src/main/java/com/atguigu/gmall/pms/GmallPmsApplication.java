package com.atguigu.gmall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@EnableSwagger2    //开启接口文档
@EnableFeignClients   //远程调用
@MapperScan(basePackages = "com.atguigu.gmall.pms.mapper")
@SpringBootApplication
//@RefreshScope  在那个类中使用注册中心的数据要加这个注解，作用是当修改注册中心中的数据时，这里可以获取到
public class GmallPmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }
}
