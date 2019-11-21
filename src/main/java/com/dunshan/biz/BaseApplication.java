package com.dunshan.biz;

import com.dunshan.biz.client.PDClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication(scanBasePackages = {"com.dunshan"})
@MapperScan(basePackages = {"com.dunshan.biz.mapper"})
@EnableEurekaClient
@EnableFeignClients(basePackageClasses = {PDClient.class})
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class BaseApplication {

  public static void main(String[] args) {
    SpringApplication.run(BaseApplication.class, args);
  }

}
