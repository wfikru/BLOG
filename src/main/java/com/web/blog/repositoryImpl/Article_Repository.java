
package com.web.blog.repositoryImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.blog.domain.Article;
import com.web.blog.repository.IArticle_Repository;


@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class Article_Repository implements IArticle_Repository {
    
	@Autowired
    private SessionFactory sessionFactory;

    @Transactional(propagation=Propagation.SUPPORTS)
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    

  
    @Override
    public List<Article> getAll() {
        
        List<Article> articles = sessionFactory.getCurrentSession().createQuery("from Article").list();
   
        return articles;
    }

    @Override
    public void add(Article article) {
            
        sessionFactory.getCurrentSession().save(article);
     
    }

    @Override
    public Article get(int id) {
 
          return (Article)sessionFactory.getCurrentSession().get(Article.class, id);
    }

    @Override
    public void update(int articleId, Article article) {
         
         sessionFactory.getCurrentSession().update(article);
    }

    @Override
    public void delete(int articleId) {

        sessionFactory.getCurrentSession().delete(this.get(articleId));
    }
    
}
