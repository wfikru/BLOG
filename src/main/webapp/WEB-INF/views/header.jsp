
<p style="margin-bottom: 100px;"></p>
<header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav"
	role="banner">
	<div class="container">
		<div class="navbar-header">
			<button class="navbar-toggle" type="button" data-toggle="collapse"
				data-target=".bs-navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>
		
		<nav class="collapse navbar-collapse bs-navbar-collapse"
			role="navigation">
			<form class="navbar-form navbar-right" role="search">

				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
				<a href="?language=en">English </a>|<a href="?language=fr">
					French</a>
			</form>
			<!--<div class="pull-right" style="padding-right: 50px">
			 	<a href="?language=en">English </a>|<a href="?language=fr">
					French</a>
			</div> -->
			<ul class="nav navbar-nav">
				<li class="active"><a href="<spring:url value="/" />">Home</a></li>
				
				<li><a
					href="<spring:url value="/resources/contact.jsp "/>">Contact</a></li>

				<li><a href="<spring:url value="/resources/about.jsp "/>">About</a></li>

				<!-- <sec:authorize access="hasRole('ROLE_ADMIN')">

					<li><a href="addArticle">Add Article</a></li>

				</sec:authorize> -->
				<li><a href="addArticle">Add Article</a></li>
				<li><a href="<c:url value="/j_spring_security_logout" />"> Logout</a></li>

			</ul>
		</nav>
	</div>
</header>