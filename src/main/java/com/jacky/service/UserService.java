package com.jacky.service;

import com.jacky.po.User;

/**
 * @author Jacky
 */
public interface UserService {

    User checkUser(String username, String password);
}
