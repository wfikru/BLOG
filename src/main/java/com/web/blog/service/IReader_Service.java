
package com.web.blog.service;

import java.util.List;

import com.web.blog.domain.Reader;


public interface IReader_Service {
    public List<Reader> getAll();

    public void add(Reader reader);

    public Reader get(int id);

    public void update(int readerId, Reader reader);
    
    public void delete(int readerId);
    
    public Reader getReader(String username);
}
