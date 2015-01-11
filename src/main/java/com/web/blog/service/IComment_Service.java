
package com.web.blog.service;

import java.util.List;

import com.web.blog.domain.Comment;

public interface IComment_Service {
    
    public List<Comment> getAll();

    public void add(Comment comment);

    public Comment get(int id);

    public void update(int commentId, Comment comment);

    public void delete(int commentId);
}
