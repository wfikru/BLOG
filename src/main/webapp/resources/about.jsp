<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="A Bootstrap Blog Template">
	<meta name="author" content="Vijaya Anand">

	<title>About Me</title>

	<!-- Bootstrap CSS file -->
	<link href="lib/bootstrap-3.0.3/css/bootstrap.min.css" rel="stylesheet" />
	<link href="lib/bootstrap-3.0.3/css/bootstrap-theme.min.css" rel="stylesheet" />
	<link href="blog.css" rel="stylesheet" />
</head>

<body>

	<!-- Header -->
	<header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav" role="banner">
		<div class="container">
			<div class="navbar-header">
				<button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".bs-navbar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				
			</div>
			<nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
				<form class="navbar-form navbar-right" role="search">
			      <div class="form-group">
			        <input type="text" class="form-control" placeholder="Search">
			      </div>
			      <button type="submit" class="btn btn-default">Submit</button>
			    </form>				
				<ul class="nav navbar-nav">
					<li class="active"><a href="<spring:url value="/" />">Home</a></li>
					<li><a href="contact.jsp">Contact</a></li>
					<li class="active"><a href="about.jsp">About</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<!-- Body -->
	<div class="container">
		<h1>About Me</h1>				

		<div class="row">
			<div class="col-md-3 col-sm-3">
				<img class="img-thumbnail img-responsive photo" src="blog-world.jpg" />
			</div>
			<div class="col-md-9 col-sm-9">
				<h3>Hi guys, we are Fikru, Gezachew and Yared and this is <i>our Blog!</i></h3>
			
			</div>
		</div>	


	</div>

</body>
</html>