
package com.web.blog.service;

import java.util.List;

import com.web.blog.domain.Author;

public interface IAuthor_Service {
    
    public List<Author> getAll();

    public void add(Author author);

    public Author get(int id);

    public void update(int authorId, Author author);

    public void delete(int authorId);
}
