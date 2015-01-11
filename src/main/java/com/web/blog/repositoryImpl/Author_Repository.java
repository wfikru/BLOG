
package com.web.blog.repositoryImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.blog.domain.Article;
import com.web.blog.domain.Author;
import com.web.blog.repository.IAuthor_Repository;



@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class Author_Repository implements IAuthor_Repository{

	@Autowired
      private SessionFactory sessionFactory;
      
    @Transactional(propagation=Propagation.SUPPORTS)
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    
    @Override
    public List<Author> getAll() {
    	List<Author> authors = sessionFactory.getCurrentSession().createQuery("from Author").list();
    	   
        return authors;
    }

    @Override
    public void add(Author author) {
        sessionFactory.getCurrentSession().save(author);
    }

    @Override
    public Author get(int id) {
        return (Author)sessionFactory.getCurrentSession().get(Author.class, id);
    }

    @Override
    public void update(int authorId, Author author) {
        sessionFactory.getCurrentSession().update(author);
    }

    @Override
    public void delete(int authorId) {
         sessionFactory.getCurrentSession().delete(this.get(authorId));
    }
    
}
