package com.arthropod.arthropod.service;

import com.arthropod.arthropod.bean.LoginUserDto;

import java.util.Map;

public interface LoginService {
    LoginUserDto selectLoginUser(String userId, String passWord);
}
