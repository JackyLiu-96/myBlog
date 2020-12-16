package com.jacky.service;

import com.jacky.po.Blog;
import com.jacky.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;


/**
 * @author LiuJiang
 * @date 2020/12/2 15:10
 */
public interface BlogService {
    /**
     * 根据id获取博客
     *
     * @param id
     * @return
     */
    Blog getBlog(Long id);

    /**
     * 获取并转换
     *
     * @param id
     * @return
     */
    Blog getAndConvert(Long id);

    /**
     * 分页查询博客
     *
     * @param pageable
     * @param blog
     * @return
     */
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    /**
     * 分页查询博客
     *
     * @param pageable
     * @return
     */
    Page<Blog> listBlog(Pageable pageable);

    /**
     * 分页查询博客
     * @param tagId
     * @param pageable
     * @return
     */
    Page<Blog> listBlog(Long tagId, Pageable pageable);

    /**
     * 查询博客
     *
     * @param query
     * @param pageable
     * @return
     */
    Page<Blog> listBlog(String query, Pageable pageable);

    /**
     * 推荐的博客列表
     *
     * @param size
     * @return
     */
    List<Blog> listRecommendBlogTop(Integer size);

    Map<String,List<Blog>> archiveBlog();

    Long countBlog();

    /**
     * 新增保存博客
     *
     * @param blog
     * @return
     */
    Blog saveBlog(Blog blog);

    /**
     * 更新博客
     *
     * @param id
     * @param blog
     * @return
     */
    Blog updateBlog(Long id, Blog blog);

    /**
     * 删除博客
     *
     * @param id
     */
    void deleteBlog(Long id);
}
