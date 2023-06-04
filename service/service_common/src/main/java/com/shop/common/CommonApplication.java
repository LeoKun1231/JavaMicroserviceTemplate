package com.shop.common;


import com.shop.filter.MyFeignClientInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.shop.common.mapper")
@ComponentScan(value = "com.shop")
@EnableDiscoveryClient
//@EnableFeignClients(basePackages = "com")
public class CommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class,args);
    }

    /**
     * 以免远程调用报401
     * @return
     */
    @Bean
    public MyFeignClientInterceptor myFeignClientInterceptor(){
        return new MyFeignClientInterceptor();
    }
}
