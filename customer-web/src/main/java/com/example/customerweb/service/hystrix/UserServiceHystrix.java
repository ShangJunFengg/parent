package com.example.customerweb.service.hystrix;

import com.example.api.bean.UserBean;
import com.example.customerweb.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements IUserService {

    @Override
    public UserBean getUser(String name) {
        UserBean userBean = new UserBean();
        userBean.setName(name+"----error");
        return userBean;
    }
}
