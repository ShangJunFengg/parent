package com.example.provideweb.controller;
import com.example.api.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

        @Autowired
        private ServerProperties serverProperties;

    @GetMapping("/getuser")
    public UserBean getUser(@RequestParam String name)
    {
        UserBean userBean = new UserBean();
        userBean.setName(name+"------"+serverProperties.getPort());
        return userBean;
    }

}
