package com.arthropod.arthropod.service.Impl;

import com.arthropod.arthropod.bean.LoginUserDto;
import com.arthropod.arthropod.mapper.LoginMapper;
import com.arthropod.arthropod.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService{

    @Resource
    private LoginMapper loginMapper = null;

    @Override
    public LoginUserDto selectLoginUser(String userId, String passWord) {
        LoginUserDto loginUserDto= loginMapper.selectLoginUser(userId,passWord);
        return loginUserDto;
    }
}