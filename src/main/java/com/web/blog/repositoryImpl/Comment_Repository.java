

package com.web.blog.repositoryImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.blog.domain.Comment;
import com.web.blog.repository.IComment_Repository;


@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class Comment_Repository implements IComment_Repository {

	@Autowired
    private SessionFactory sessionFactory;
    
    @Transactional(propagation=Propagation.SUPPORTS)
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public List<Comment> getAll() {
    	List<Comment> comments = sessionFactory.getCurrentSession().createQuery("from Comment").list();
    	   
        return comments;
        }

    @Override
    public void add(Comment comment) {
        sessionFactory.getCurrentSession().save(comment);
    }

    @Override
    public Comment get(int id) {
        return (Comment)sessionFactory.getCurrentSession().get(Comment.class, id);
    }

    @Override
    public void update(int commentId, Comment comment) {
        sessionFactory.getCurrentSession().update(comment);
    }

    @Override
    public void delete(int commentId) {
         sessionFactory.getCurrentSession().delete(this.get(commentId));
    }
    
}
