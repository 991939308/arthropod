package com.arthropod.arthropod.mapper;


import com.arthropod.arthropod.bean.LoginUserDto;


public interface LoginMapper {

    LoginUserDto selectLoginUser(String userId, String passWord);

}