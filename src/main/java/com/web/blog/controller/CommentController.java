
package com.web.blog.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.blog.domain.Article;
import com.web.blog.domain.Comment;
import com.web.blog.domain.Reader;
import com.web.blog.serviceImpl.Comment_Service;

@Controller
public class CommentController {

	public CommentController() {
	}

	@Resource
	private Comment_Service commentService;

	public void setCommentService(Comment_Service commentService) {
		this.commentService = commentService;
	}

	@RequestMapping(value = "/addcomment", method = RequestMethod.POST)
	public String addComment(@RequestBody String body, Model model,
			HttpSession session) {
		Article currentArticle = (Article) session
				.getAttribute("currentArticle");
		Reader currentReader = (Reader) session.getAttribute("currentReader");
		Comment comment = new Comment(body, new Date(), currentArticle,
				currentReader);
		int id = currentArticle.getId();

		String url = "redirect:/articles/" + id;
		commentService.add(comment);
		return url;
	}

	@RequestMapping(value = "/getcomment")
	public @ResponseBody List<Comment> loadComments(@RequestBody String body,
			Model model, HttpSession session) {

		List<Comment> comments = commentService.getAll();
		return comments;
	}
	
	@RequestMapping("/delcomment/{id}")
	public String delcomment(@PathVariable("id") String id, Model model)
	{
		int commid = Integer.parseInt(id);
		commentService.delete(commid);
		return "redirect:/";
		
	}
}
