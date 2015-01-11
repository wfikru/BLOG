<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<!-- Header -->
	<%@ include file="header.jsp"%>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>
					<spring:message code="signUp.label" />
				</h1>
				<p>
					<spring:message code="signUpform.label" />
				</p>
			</div>
		</div>
	</section>
	<div class="container">
		<div class="row">
			<div class="col-md-5 col-md-offset-1">
				<div class="panel panel-default">
					<div class="panel-heading"></div>

					<div class="panel-body">
						<c:if test="${not empty error}">
							<div class="alert alert-danger">
								<spring:message
									code="AbstractUserDetailsAuthenticationProvider.badCredentials" />
								<br />
							</div>
						</c:if>

						<form:form commandName="reader" action="signup" method="POST">
							<form:errors path="*" cssClass="alert alert-danger" element="div" />
							<fieldset>
								<div class="row form-group">
									<div class="col-lg-4">
										<spring:message code="firstName.label" />
									</div>
									<div class="col-lg-4">

										<form:input path="firstName" type="text" name="firstName"
											class="control-label" placeholder="First Name" />

									</div>
								</div>

								<div class="row form-group">
									<div class="col-lg-4">
										<spring:message code="lastName.label" />
									</div>
									<div class="col-lg-4">

										<form:input path="lastName" type="text" name="lastName"
											class="control-label" placeholder="Last Name" />

									</div>
								</div>


								<div class="row form-group">
									<div class="col-lg-4">
										<spring:message code="email.label" />
									</div>
									<div class="col-lg-4">
										<form:input class="control-label" path="email" type="text"
											name="email" placeholder="Email" />

									</div>
								</div>


								<div class="row form-group">
									<div class="col-lg-4">
										<spring:message code="gender.label" />
									</div>
									<div class="col-lg-4">
										<form:select path="gender" class="control-label" name="gender">
											<form:option value="">Select Gender</form:option>
											<form:option value="m">Male</form:option>
											<form:option value="f">Female</form:option>
										</form:select>


									</div>
								</div>

								<div class="row form-group">
									<div class="col-lg-4">
										<spring:message code="userName.label" />
									</div>
									<div class="col-lg-4">
										<form:input class="control-label" path="userName" type="text"
											name="userName" placeholder="User Name" />

									</div>
								</div>

								<div class="row form-group">
									<div class="col-lg-4">
										<spring:message code="Password.label" />
									</div>
									<div class="col-lg-4">
										<input class="control-label" placeholder="Password"
											name='j_password' type="password" value="">

									</div>
								</div>

								<div class="row form-group">
									<div class="col-lg-5"></div>
									<div class="col-lg-5">
										<input class="btn btn-lg btn-success btn-block" type="submit"
											value="<spring:message code="signUp.label"/>" />
									</div>
									<div class="col-lg-1"></div>
								</div>

							</fieldset>
						</form:form>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>