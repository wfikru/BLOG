
package com.web.blog.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.blog.domain.Comment;
import com.web.blog.repository.IComment_Repository;

@Service
@Transactional
public class Comment_Service {
   
	@Autowired
    private IComment_Repository commentRepository;
 
    public Comment_Service() {
    }
    
    public void setcommentRepository(IComment_Repository commentRepository) {
        this.commentRepository = commentRepository;
    }

    
     public  List<Comment> getAll(){
         
         return commentRepository.getAll();
     }

	public  void add(Comment comment){
            
            commentRepository.add(comment);
        }

	public  Comment get(int id){
            
            return commentRepository.get(id);
        }

	public  void update(int commentId, Comment comment){
            
            commentRepository.update(commentId, comment);
        }

	public  void delete(int commentId){
            
            commentRepository.delete(commentId);
        }
    
    
    
}
