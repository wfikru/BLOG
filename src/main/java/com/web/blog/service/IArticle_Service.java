
package com.web.blog.service;

import java.util.List;

import com.web.blog.domain.Article;


public interface IArticle_Service {

    public List<Article> getAll();

    public void add(Article article);

    public Article get(int id);

    public void update(int articleId, Article article);

    public void delete(int articleId);
}
