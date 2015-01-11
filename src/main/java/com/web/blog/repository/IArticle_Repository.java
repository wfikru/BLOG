
package com.web.blog.repository;

import java.util.List;

import com.web.blog.domain.Article;

public interface IArticle_Repository {
    
    public abstract List<Article> getAll();

	public abstract void add(Article article);

	public abstract Article get(int id);

	public abstract void update(int articleId, Article article);

	public abstract void delete(int articleId);
    
}
