
package com.web.blog.repositoryImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.blog.domain.Article;
import com.web.blog.domain.Comment;
import com.web.blog.domain.Reader;
import com.web.blog.repository.IReader_Repository;


@Repository
@Transactional
public class Reader_Repository implements IReader_Repository {
    
	@Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Reader> getAll() {
    	List<Reader> readers = sessionFactory.getCurrentSession().createQuery("from Reader").list();
    	   
        return readers;    
    }

    @Override
    public void add(Reader reader)throws Exception{
        
         
        Query query = sessionFactory.getCurrentSession().createQuery("Select distinct r from Reader r where r.userName=:username");
         query.setString("username", reader.getUserName());
         
         if(!query.list().isEmpty()){
             throw new Exception();
         }else{
             sessionFactory.getCurrentSession().save(reader); 
         }
    }

    @Override
    public Reader get(int id) {
        return (Reader)sessionFactory.getCurrentSession().get(Reader.class, id);
    }

    @Override
    public void update(int readerId, Reader reader) {
        sessionFactory.getCurrentSession().update(reader);
    }

    @Override
    public void delete(int readerId) {
         sessionFactory.getCurrentSession().delete(this.get(readerId));
    }
    
    @Override
    public Reader getReader(String username) {
        
         Query query = sessionFactory.getCurrentSession().createQuery("Select distinct r from Reader r where r.userName=:username");
         query.setString("username", username);
         
         Reader theReader = (Reader)query.uniqueResult();
    
         return theReader;
    }
    
}
