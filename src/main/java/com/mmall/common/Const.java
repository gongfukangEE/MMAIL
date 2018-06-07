package com.mmall.common;

/**
 * @Auther gongfukang
 * @Date 2018/6/6 11:23
 */
public class Const {
    public static final String CURRENT_USER = "current_user";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role {
        int ROLE_CUSTOMER = 0;      //普通用户
        int ROLE_ADMIN = 1;         //管理员
    }
}