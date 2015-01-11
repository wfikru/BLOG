<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Aries Sun Sign March 21 - April 19</title>

<!-- Bootstrap CSS file -->
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
</head>

<body>

<!-- Header -->
	<%@ include file="header.jsp" %> 


	<form class="form-horizontal"
		id="contactForm" method="post"
		action="addarticle">
		<div class="form-group">
			<label class="col-md-3 control-label">Autor Name</label>
			<div class="col-md-6">
				<input type="text" class="form-control" name="authorName" />
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-3 control-label">Category</label>
			<div class="col-md-6">
				<input type="text" class="form-control" name="category"
					placeholder="Category" />
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-3 control-label">Title</label>
			<div class="col-md-6">
				<input type="text" class="form-control" name="title" />
			</div>
		</div>

		<div class="form-group">
			<label class="col-md-3 control-label">Content</label>
			<div class="col-md-6">
				<textarea class="form-control" name="body" rows="15"></textarea>
			</div>
		</div>

		<div class="form-group">
			<div class="col-md-9 col-md-offset-3">
				<div id="messages"></div>
			</div>
		</div>

		<div class="form-group">
			<div class="col-md-9 col-md-offset-3">
				<input type="submit" class="btn btn-default" value="Post"></input>
			</div>
		</div>

		
	</form>
</body>
</html>