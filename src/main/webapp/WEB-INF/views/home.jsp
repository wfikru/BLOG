
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="A Bootstrap Blog Template">
<meta name="author" content="Vijaya Anand">

<title>My Blog</title>


<!-- Bootstrap CSS file -->

<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
</head>

<body>
	<!-- Header -->
	<%@ include file="header.jsp" %> 

	<!-- Body -->
	<div class="container">
		<div class="row">
			<div class="col-md-8">

				<h1>
					<spring:message code="latestPost.label" />
				</h1>

				<c:forEach var="article" items="${articles}">
					<article>
						<h2>
							<a href="<spring:url value="articles/${article.id}" />">${article.title}
								${article.publishDate}</a>
						</h2>

						<div class="row">

							<div class="col-sm-6 col-md-6">
								<span class="glyphicon glyphicon-pencil"></span> <a
									href="singlepost.html#comments">Comments</a> &nbsp;&nbsp; <span
									class="glyphicon glyphicon-list-alt">
									${article.category}</span>
							</div>
						</div>

						<hr>

						<img src="" class="img-responsive">

						<br />

						<p class="lead">${article.content}</p>


						<p class="text-right">
							<a href=" <spring:url value="articles/${article.id}" /> "
								class="btn btn-primary"> <span
								class="glyphicon-info-sign glyphicon" /></span> <spring:message
									code="readMore.label" />
							</a>
						</p>

						<hr>
					</article>
				</c:forEach>

				<ul class="pager">
					<li class="previous"><a href="#">&larr; Previous</a></li>
					<li class="next"><a href="#">Next &rarr;</a></li>
				</ul>

			</div>
			<div class="col-md-4">

				<div class="well text-center">
					<p class="lead">
						<spring:message code="updates.label" />
						
					</p>

					<a class="btn btn-primary btn-lg" href="readerSignup"><spring:message
							code="signUphere.label" /></a>
				</div>

				<!-- Latest Posts -->
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4><spring:message
							code="latestPost.label" /></h4>
					</div>
					<ul class="list-group">
						<c:forEach var="article" items="${articles}" begin="0" end="4">

							<li class="list-group-item"><a
								href=" <spring:url value="articles/${article.id}" /> ">${article.title}
									${article.publishDate}</a></li>
						</c:forEach>
					</ul>
				</div>

				<!-- Categories -->
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4><spring:message
							code="categories.label" /></h4>
					</div>
					<ul class="list-group">
						<li class="list-group-item"><a href="#">Sport</a></li>
						<li class="list-group-item"><a href="#">Poletics</a></li>
						<li class="list-group-item"><a href="#">Social</a></li>
					</ul>
				</div>

			</div>
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