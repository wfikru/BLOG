

package com.web.blog.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
//import MyBlog_Entities.Reader;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import com.web.blog.domain.Article;
import com.web.blog.domain.Comment;
import com.web.blog.service.IArticle_Service;
import com.web.blog.serviceImpl.Article_Service;

@Controller
public class ArticleController {

	public ArticleController() {
	}

	@Autowired
	private IArticle_Service articleService;

	public void setArticleService(Article_Service articleService) {
		this.articleService = articleService;
	}

	@RequestMapping("/")
	public String redirectRoot() {
		return "redirect:/home2";
	}

	@RequestMapping(value = "/addarticle", method = RequestMethod.POST)
	public String addArticle(String title, String authorName, String category,
			String body, HttpServletRequest request) {
		List<Comment> commentsList = new ArrayList<Comment>();
		Article article = new Article(title, authorName, category, body,
				new Date(), commentsList);
		articleService.add(article);


		return "redirect:/home2";
	}

	@RequestMapping(value = "/home2", method = RequestMethod.GET)
	public String goHome(Model model, HttpSession session) {
		List<Article> allArticles = articleService.getAll();
		Collections.reverse(allArticles);
		model.addAttribute("currentReader",
				session.getAttribute("currentReader"));
		model.addAttribute("articles", allArticles);

		return "home";
	}

	@RequestMapping(value = "/articles/{id}", method = RequestMethod.GET)
	public String getArticles(@PathVariable int id, Model model,
			HttpSession session) {
		session.setAttribute("currentArticle", articleService.get(id));
		model.addAttribute("currentArticle",
				session.getAttribute("currentArticle"));

		List<Comment> comments = ((Article) session
				.getAttribute("currentArticle")).getComments();
		model.addAttribute("comments", comments);

		return "readArticle";
	}
	
}
