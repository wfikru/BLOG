
package com.web.blog.repository;


import java.util.List;

import com.web.blog.domain.Comment;


public interface IComment_Repository {
    
    public abstract List<Comment> getAll();

	public abstract void add(Comment comment);

	public abstract Comment get(int id);

	public abstract void update(int commentId, Comment comment);

	public abstract void delete(int commentId);
    
    
}
