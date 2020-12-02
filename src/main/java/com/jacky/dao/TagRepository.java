package com.jacky.dao;

import com.jacky.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jacky
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);
}
