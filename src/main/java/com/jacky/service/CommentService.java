package com.jacky.service;

import com.jacky.po.Comment;

import java.util.List;

/**
 * @author Jacky
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
