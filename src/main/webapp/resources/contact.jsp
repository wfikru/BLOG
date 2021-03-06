<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="A Bootstrap Blog Template">
	<meta name="author" content="Vijaya Anand">

	<title>Contact Me</title>

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
					<li class="active"><a href="contact.jsp">Contact</a></li>
					<li><a href="about.jsp">About</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<!-- Body -->
	<div class="container">
		<h1>Contact Me</h1>

		<div class="well">
			<p class="lead">
				Do you have any question? 
			</p>
		</div>

		<div class="contact-form">
			<form class="form-horizontal col-md-8" role="form">

			  <div class="form-group">
				<label for="name" class="col-md-2">Name</label>
				<div class="col-md-10">
			    	<input type="text" class="form-control" id="name" placeholder="Name">
			    </div>
			  </div>

			  <div class="form-group">
			    <label for="email" class="col-md-2">Email</label>
			    <div class="col-md-10">
			    	<input type="email" class="form-control" id="email" placeholder="Email">
			    </div>
			  </div>

			  <div class="form-group">
			    <label for="subject" class="col-md-2">Subject</label>
			    <div class="col-md-10">
			    	<input type="subject" class="form-control" id="subject" placeholder="Subject">
			    </div>
			  </div>

			  <div class="form-group">
			    <label for="message" class="col-md-2">Message</label>
			    <div class="col-md-10">
			    	<textarea class="form-control" id="message" placeholder="Message"></textarea>
			    </div>
			  </div>

			  <div class="form-group">
			  	<div class="col-md-12 text-right">
			  		<button type="submit" class="btn btn-lg btn-primary">Submit your message!</button>
			  	</div>
			  </div>
			</form>	
		</div>
	</div>

	<!-- Footer -->
	<footer>
		<div class="container">
			<hr />
			<p class="text-center">Copyright &copy; Group3</p>
		</div>
	</footer>

	<!-- Jquery and Bootstrap Script files -->
	<script src="lib/jquery-2.0.3.min.js"></script>
	<script src="lib/bootstrap-3.0.3/js/bootstrap.min.js"></script>
</body>
</html>