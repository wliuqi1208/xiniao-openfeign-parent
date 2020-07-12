package com.xiniao.service.order.impl;

import com.xiniao.service.order.openFeign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: wangliuqi
 * Date: 2020/7/12 13:18
 */
@RestController
public class OrderService {

    @Autowired
    MemberServiceFeign memberServiceFeign;

    /**
     * 基于Feign形式实现RPC远程调用
     * @return
     */
    @RequestMapping("/orderFeignToMember")
    public String orderFeignToMember(){
        String user = memberServiceFeign.getUser(1);
        return "我是订单服务，调用会员服务的接口，返回的结果: "+user;
    }

}
