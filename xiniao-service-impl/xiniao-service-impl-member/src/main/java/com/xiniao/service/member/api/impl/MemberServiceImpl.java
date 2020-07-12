package com.xiniao.service.member.api.impl;

import com.xiniao.service.member.api.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: wangliuqi
 * Date: 2020/7/12 13:05
 */
@RestController
public class MemberServiceImpl implements MemberService {

    @Value("${server.port}")
    private String serverPort;

    @Override
    public String getUser(Integer userId) {
        return "我是会员服务"+serverPort;
    }
}
