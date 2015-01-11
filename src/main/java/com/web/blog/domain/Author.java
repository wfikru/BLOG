
package com.web.blog.domain;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private String Email;
    
   

    public Author(String firstName, String lastName, String Email, Collection<Article> articles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        //this.articles = articles;
    }

    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

//    public Collection<Article> getArticles() {
//        return articles;
//    }
//
//    public void setArticles(Collection<Article> articles) {
//        this.articles = articles;
//    }
    
}
