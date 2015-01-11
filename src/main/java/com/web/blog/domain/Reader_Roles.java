
package com.web.blog.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Reader_Roles {
    
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Reader reader;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Role authority;

    public Reader_Roles() {
    }

    public Reader_Roles(Reader reader, Role authority) {
        this.reader = reader;
        this.authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Role getAuthority() {
        return authority;
    }

    public void setAuthority(Role authority) {
        this.authority = authority;
    }
    
    
    
    
    
    
    
}
