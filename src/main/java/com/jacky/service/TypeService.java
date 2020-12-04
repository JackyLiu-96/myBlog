package com.jacky.service;

import com.jacky.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Jacky
 */
public interface TypeService {

    /**
     * 新增保存分类
     * @param type
     * @return
     */
    Type saveType(Type type);

    /**
     * 根据id获取分类
    * @param id
     * @return
     */
    Type getType(Long id);

    /**
     * 根据名称获取分类
     * @param name
     * @return
     */
    Type getTypeByName(String name);

    /**
     * 分页查询分类
     * @param pageable
     * @return
     */
    Page<Type> listType(Pageable pageable);

    /**
     * 获取所有的分类
     * @return
     */
    List<Type> listType();

    /**
     * 修改分类
     * @param id
     * @param type
     * @return
     */
    Type updateType(Long id, Type type);

    /**
     * 删除分类
     * @param id
     */
    void deleteType(Long id);
}
