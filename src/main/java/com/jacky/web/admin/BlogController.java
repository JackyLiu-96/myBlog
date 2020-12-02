package com.jacky.web.admin;

import com.jacky.po.Blog;
import com.jacky.service.BlogService;
import com.jacky.service.TypeService;
import com.jacky.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jacky
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeService typeService;

    @GetMapping("/blogs")
    public String blogs(@PageableDefault(size = 3, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                        BlogQuery blog, Model model) {
        model.addAttribute("types",typeService.listType());
        model.addAttribute("page",blogService.listBlog(pageable, blog));
        return "admin/blogs";
    }

    @GetMapping("/blogs/search")
    public String search(@PageableDefault(size = 3, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                         BlogQuery blog, Model model) {
        model.addAttribute("page",blogService.listBlog(pageable, blog));

        //blogs.html 下的blogList片段，实现局部渲染
        return "admin/blogs :: blogList";
    }
}
