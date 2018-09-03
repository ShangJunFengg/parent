package com.example.customerweb.service;

import com.example.api.bean.UserBean;
import com.example.customerweb.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provide" ,fallback = UserServiceHystrix.class)
public interface IUserService {

    @GetMapping("/user/getuser")
     UserBean getUser(@RequestParam(value = "name") String name);

}
