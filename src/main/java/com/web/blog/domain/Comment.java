
package com.web.blog.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;


@Entity
public class Comment {
    @Id
    @GeneratedValue
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date commentDate;
    
    @ManyToOne
    private Article article;
    
    @ManyToOne
    private Reader commentor;
    
    private String body;

    public Comment() {
    }

    public Comment(String body,Date commentDate, Article article, Reader commentor) {
        this.commentDate = commentDate;
        this.article = article;
        this.commentor = commentor;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
        article.addComment(this);
    }

    public Reader getCommentor() {
        return commentor;
    }

    public void setCommentor(Reader commentor) {
        this.commentor = commentor;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
}
