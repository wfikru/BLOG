

package com.web.blog.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.web.blog.domain.Reader;
import com.web.blog.repository.IReader_Repository;

@Service
@Transactional
public class Reader_Service {
    
	@Autowired
    private IReader_Repository readerRepository;
 
    public Reader_Service() {
    }
    
   
    public void setreaderRepository(IReader_Repository readerRepository) {
        this.readerRepository = readerRepository;
    }
    
     public   List<Reader> getAll(){
         
         return readerRepository.getAll();
     }

	public   void add(Reader reader) throws Exception{
            readerRepository.add(reader);
        }

	public   Reader get(int id){
            
            return readerRepository.get(id);
        }

	public   void update(int readerId, Reader reader){
            
            readerRepository.update(readerId, reader);
        }

	public   void delete(int readerId){
            
            readerRepository.delete(readerId);
        }
        
        public Reader getReader(String username){
            
            return readerRepository.getReader(username);
        }
    
}
