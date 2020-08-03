package com.xiniao.service.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Author: wangliuqi
 * Date: 2020/7/12 13:33
 */
@SpringBootApplication
@EnableFeignClients
public class OrderBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderBootApplication.class);
        System.out.println("菩萨保佑，订单项目启动成功！");
        System.out.println("******20200803测试一把");
    }

}
