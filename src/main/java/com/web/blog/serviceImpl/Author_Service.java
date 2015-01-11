
package com.web.blog.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.blog.domain.Author;
import com.web.blog.repository.IAuthor_Repository;

@Service
@Transactional
public class Author_Service {
    
	@Autowired
    private IAuthor_Repository authorRepository;
    


    public Author_Service() {
    }
    
   
    public void setauthorRepository(IAuthor_Repository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public  List<Author> getAll(){
        
        return authorRepository.getAll();
    }

	public  void add(Author author){
            
            authorRepository.add(author);
        }

	public  Author get(int id){
            
            return authorRepository.get(id);
        }

	public  void update(int authorId, Author author){
            
            authorRepository.update(authorId, author);
        }

	public  void delete(int authorId){
            
            authorRepository.delete(authorId);
        }
}
