package com.telusko;

import com.telusko.model.Blog;
import com.telusko.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class BloggingAppWithoutControllerApplication {

    @Autowired
    private BlogService blogService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BloggingAppWithoutControllerApplication.class, args);
        BloggingAppWithoutControllerApplication app = context.getBean(BloggingAppWithoutControllerApplication.class);
        app.run();
    }

    public void run() {
        List<Blog> blogList = blogService.getAllBlogs();
        blogList.forEach(blog -> System.out.println(blog));
    }


}
