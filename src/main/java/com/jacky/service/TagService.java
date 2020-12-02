package com.jacky.service;

import com.jacky.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Jacky
 */
public interface TagService {

    /**
     * 新增保存标签
     * @param tag
     * @return
     */
    Tag saveTag(Tag tag);

    /**
     * 根据id获取标签
     * @param id
     * @return
     */
    Tag getTag(Long id);

    /**
     * 根据名称获取标签
     * @param name
     * @return
     */
    Tag getTagByName(String name);

    /**
     * 分页查询标签
     * @param pageable
     * @return
     */
    Page<Tag> listTag(Pageable pageable);

    /**
     * 修改标签
     * @param id
     * @param tag
     * @return
     */
    Tag updateTag(Long id, Tag tag);

    /**
     * 删除标签
     * @param id
     */
    void deleteTag(Long id);
}
