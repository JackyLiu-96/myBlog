package com.jacky.dao;

import com.jacky.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jacky
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
