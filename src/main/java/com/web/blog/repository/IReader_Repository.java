
package com.web.blog.repository;

import java.util.List;

import com.web.blog.domain.Reader;

public interface IReader_Repository {

	public abstract List<Reader> getAll();

	public abstract void add(Reader reader) throws Exception;

	public abstract Reader get(int id);

	public abstract void update(int readerId, Reader reader);

	public abstract void delete(int readerId);

	public Reader getReader(String username);

}
