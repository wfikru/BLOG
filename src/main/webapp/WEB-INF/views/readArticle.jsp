<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>${currentArticle.title}</title>

<!-- Bootstrap CSS file -->
<link href="lib/bootstrap-3.0.3/css/bootstrap.min.css" rel="stylesheet" />
<link href="lib/bootstrap-3.0.3/css/bootstrap-theme.min.css"
	rel="stylesheet" />


<!-- Bootstrap CSS file -->
<link href="/resources/lib/bootstrap-3.0.3/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="/resources/lib/bootstrap-3.0.3/css/bootstrap-theme.min.css"
	rel="stylesheet" />
<link href="/resources/lib/bootstrap-3.0.3/css/blog.css"
	rel="stylesheet" />
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
				<article>
					<h1>${currentArticle.title}
						${currentArticle.publishDate}</a>
					</h1>

				</article>

				<ul class="pager">
					<li class="previous"><a href="<spring:url value="/" />">&larr;
							Back to posts</a></li>
					</a>
				</ul>
					<p>${currentArticle.content}</p>
				<hr />

				<div class="container">
					<div class="row">
						<div class="panel panel-default widget">
							<div class="panel-heading">
								<span class="glyphicon glyphicon-comment"></span>
								<h3 class="panel-title">Recent Comments</h3>
								<span class="label label-info"> ${comments.size()}</span>
							</div>
							<div class="panel-body">
								<ul class="list-group">
									<c:forEach var="comment" items="${comments}">
										<li class="list-group-item">
											<div class="row">
												<div class="col-xs-2 col-md-1">
													<img src="http://placehold.it/80"
														class="img-circle img-responsive" alt="" />
												</div>
												<div class="col-xs-10 col-md-11">
													<div>
														<div class="mic-info">By:
															${comment.commentor.firstName} on ${comment.commentDate}
														</div>
													</div>
													<div class="comment-text">${comment.body}</div>
													<div class="action">
														<button type="button" class="btn btn-primary btn-xs"
															title="Edit">
															<span class="glyphicon glyphicon-pencil"></span>
														</button>
														<button type="button" class="btn btn-success btn-xs"
															title="Approved">
															<span class="glyphicon glyphicon-ok"></span>
														</button>
														<button type="button" class="btn btn-danger btn-xs"
															title="Delete">
															<span class="glyphicon glyphicon-trash"></span>
														</button>
													</div>
												</div>
											</div>
										</li>

									</c:forEach>
								</ul>


							</div>
						</div>
					</div>
				</div>

				<!-- Comment form -->
				<div class="well">
					<h4>Leave a comment</h4>

					
					<div class="col-md-12 form-group text-right">
						<sec:authorize access="hasRole('ROLE_USER')">
							<form method="POST" action="../addcomment">

								<textarea class="form-control" id="comment" placeholder="Comment" name="body"></textarea><br>
								<input type="submit" class="btn btn-success" value="Add Comment" />

							</form>
						</sec:authorize>
					</div>


				</div>


			</div>
			<div class="col-md-4">

				<div class="well text-center">
					<p class="lead">Don't want to miss updates?</p>

					<a class="btn btn-primary btn-lg" href="redirect:/readerSignup">Sign
						Up To My Blog</a>
				</div>

				<!-- Latest Posts -->
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>Latest Posts</h4>
					</div>
					<ol class="list-group">
						<li class="list-group-item"><a href="singlepost.html">1.
								post</a></li>
						<li class="list-group-item"><a href="singlepost.html">2.
								post</a></li>
						<li class="list-group-item"><a href="singlepost.html">3.
								post</a></li>
					</ol>
				</div>

				<!-- Categories -->
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>Categories</h4>
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

	<!-- Bootstrap Script file -->
	<script src="lib/jquery-2.0.3.min.js"></script>
	<script src="lib/bootstrap-3.0.3/js/bootstrap.min.js"></script>
</body>
</html>