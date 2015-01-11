
package com.web.blog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.blog.domain.Article;
import com.web.blog.repository.IArticle_Repository;
import com.web.blog.service.IArticle_Service;

@Service
@Transactional
public class Article_Service implements IArticle_Service {

	@Autowired
    private IArticle_Repository articleRepository;

    
    public void setarticleRepository(IArticle_Repository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article_Service() {
    }

    public List<Article> getAll() {

        return articleRepository.getAll();
    }

    public void add(Article article) {

        articleRepository.add(article);
    }

    public Article get(int id) {

        return articleRepository.get(id);
    }

    public void update(int articleId, Article article) {

        articleRepository.update(articleId, article);
    }

    public void delete(int articleId) {

        articleRepository.delete(articleId);
    }

}
