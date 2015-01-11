
package com.web.blog.repository;


import java.util.List;

import com.web.blog.domain.Author;


public interface IAuthor_Repository {
    
    public abstract List<Author> getAll();

	public abstract void add(Author author);

	public abstract Author get(int id);

	public abstract void update(int authorId, Author author);

	public abstract void delete(int authorId);
    
}
