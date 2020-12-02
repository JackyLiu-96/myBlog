package com.jacky.service;

import com.jacky.po.User;

/**
 * @author Jacky
 */
public interface UserService {

    /**
     * 根据用户名和密码校验用户
     * @param username
     * @param password
     * @return
     */
    User checkUser(String username, String password);
}
