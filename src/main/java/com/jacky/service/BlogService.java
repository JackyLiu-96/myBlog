package com.jacky.service;

import com.jacky.po.Blog;
import com.jacky.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * @author LiuJiang
 * @date 2020/12/2 15:10
 */
public interface BlogService {
    /**
     * 根据id获取博客
     * @param id
     * @return
     */
    Blog getBlog(Long id);

    /**
     * 分页查询博客
     * @param pageable
     * @param blog
     * @return
     */
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    /**
     * 新增保存博客
     * @param blog
     * @return
     */
    Blog saveBlog(Blog blog);

    /**
     * 更新博客
     * @param id
     * @param blog
     * @return
     */
    Blog updateBlog(Long id, Blog blog);

    /**
     * 删除博客
     * @param id
     */
    void deleteBlog(Long id);
}
