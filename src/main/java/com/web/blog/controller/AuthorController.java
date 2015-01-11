
package com.web.blog.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
//import MyBlog_Service.IAuthor_Service;


import com.web.blog.serviceImpl.Author_Service;


@Controller
public class AuthorController {

    public AuthorController() {
    }
    
    
    @Resource
     private Author_Service authorService;
    
     public void setAuthorService(Author_Service authorService) {
        this.authorService = authorService;
    }

}
