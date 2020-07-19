package com.xiniao.service.member.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: wangliuqi
 * Date: 2020/7/12 12:59
 */
public interface MemberService {

    @GetMapping("/getUser")
    String getUser(@RequestParam("userId") Integer userId);

}
