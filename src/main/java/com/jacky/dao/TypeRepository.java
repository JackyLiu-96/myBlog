package com.jacky.dao;

import com.jacky.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jacky
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);
}
