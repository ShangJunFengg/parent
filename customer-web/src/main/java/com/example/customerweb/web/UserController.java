package com.example.customerweb.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.customerweb.service.IUserService;

@RestController()
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Value(value = "${server.port}")
    private String port;

    @GetMapping("/getuser")
    public String getUser(@RequestParam String name)
    {
        return userService.getUser(name).getName()+"========"+port;
    }

}
