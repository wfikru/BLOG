
package com.web.blog.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Reader {
    @Id
    @GeneratedValue
    private int id;
    @NotEmpty
    @Size(max=10, min=4,message="{Size.firstName.label}")
    private String firstName;
    @NotEmpty
    @Size(max=10, min=4)
    private String lastName;
    @Size(min=1, max=1)
    private String gender;
    @Email(message="{Reader.Email}")
    private String email;
    @Size(min=4, max=10)
    private String userName;
    @Size(min=3)
    private String passWord;
    
    @OneToMany(mappedBy = "reader", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Reader_Roles> reader_roles = new ArrayList<Reader_Roles>();

    public Reader() {
    }

    public Reader(String firstName, String lastName, String gender, String email, String userName, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.userName = userName;
        this.passWord = passWord;
  
    }

    

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Reader_Roles> getReader_roles() {
        return reader_roles;
    }

    public void setReader_roles(List<Reader_Roles> reader_roles) {
        this.reader_roles = reader_roles;
    }
    
    public void addReader_role(Reader_Roles reader_role) {
        reader_roles.add(reader_role);
        reader_role.setReader(this);
    }
    
    public void removeReader_role(Reader_Roles reader_role) {
        reader_roles.remove(reader_role);
        reader_role.setReader(null);
    }

    
    
}
