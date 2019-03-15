package com.arthropod.arthropod.controller;

import com.arthropod.arthropod.bean.LoginUserDto;
import com.arthropod.arthropod.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login/intoLogin.ajax")
    public Object login(String userId,String passWord){
        LoginUserDto loginUserDto = loginService.selectLoginUser(userId,passWord);

        return loginUserDto;
    }
}
