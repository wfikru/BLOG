
package com.web.blog.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;


@Entity
public class Article {
	
    @Id
    @GeneratedValue
    private int id;
    private String title;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date publishDate;
    
    
    private String authorName;

    @Lob
    private String content;
    
    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comment> comments;
    
    private static int likes;
    
    private String category;

    public Article() {
    }

    public Article(String title, String authorName, String category, String content, Date publishDate, List<Comment> comments) {
        this.title = title;
        this.publishDate = publishDate;
        this.authorName = authorName;
        this.content = content;
        this.category = category;
        this.comments = comments;
        
    }

    public Article(String title, String authorName, String category, String content, Date publishDate) {
        this.title = title;
        this.publishDate = publishDate;
        this.authorName = authorName;
        this.content = content;
        this.category = category;
    }
    
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    
//    private MultipartFile blogImage;
//    
//    public MultipartFile getBlogImage() {
//    	return blogImage;
//    }
//    
//    public void setBlogImage(MultipartFile blogImage) {
//    	this.blogImage = blogImage;
//    }

//    public String getpDate() {
//        return pDate;
//    }
//
//    public void setpDate(String pDate) {
//        this.pDate = pDate;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public Comment getComment() {
//        return comments;
//    }
//
//    public void setComment(Comment comments) {
//        this.comments = comments;
//    }
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    
    
    public void addComment(Comment comment) {
        comments.add(comment);
        comment.setArticle(this);
    }
    
    public void removeComment(Comment comment) {
        comments.remove(comment);
        comment.setArticle(null);
    }

    public static int getLikes() {
        return likes;
    }

    public static void setLikes(int likes) {
        Article.likes = likes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
    
}
