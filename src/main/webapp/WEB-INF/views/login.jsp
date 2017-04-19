<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Please Login</title>
<link rel="stylesheet" href="css/Site_Styles.css" type="text/css"
	title="default" />
<!--  jquery core -->
<script src="js/jquery/jquery-3.2.0.min.js" type="text/javascript"></script>

<script src="js/jquery/jquery.validate.min.js" type="text/javascript"></script>


<!-- Custom jquery scripts -->
<script src="js/jquery/custom_jquery.js" type="text/javascript"></script>

<!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
<script src="js/jquery/jquery.pngFix.pack.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(document).pngFix();
	});
</script>
</head>
<body id="login-bg" onload='document.f.username.focus();'>
	<!-- Start: login-holder -->
	<div id="login-holder">

		<!-- start logo -->
		<div id="logo-login">
			<a href="#"><img src="images/shared/logo.png" alt="" /></a>
		</div>
		<!-- end logo -->

		<div class="clear"></div>

		<!--  start loginbox ................................................................................. -->
		<div id="loginbox">

			<!--  start login-inner -->
			<div id="login-inner">
			<span><label>${LoginErrorMsg}</label></span>
				<form name="f" action="login" method="post">
				<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}" />
					<table>
						<tr>
							<th>Username</th>
							<td><input type="text" name="username" class="login-inp" required minlength="3" data-msg-required="User name is required." /></td>
						</tr>
						<tr>
							<th>Password</th>
							<td><input type="password" value="************" onfocus="this.value=''"name="password" class="login-inp" required minlength="4" data-msg-required="Password is required."/></td>
						</tr>
						<tr>
							<th></th>
							<td valign="top"><input type="checkbox"
								class="checkbox-size" id="login-check" /><label
								for="login-check">Remember me</label></td>
						</tr>
						<tr>
							<th></th>
							<td><input type="submit" class="submit-login" /></td>
						</tr>
					</table>
				</form>
				<%-- <form:form modelAttribute="user" action="login" method="post">
					<table>
						<tr>
							<th>Username</th>
							<td><form:input type="text" path="userName" class="login-inp" required="true" minlength="3" maxlength="15" data-msg-required="User name is required." /></td>
						</tr>
						<tr>
							<th>Password</th>
							<td><form:input type="password" value="************"
								onfocus="this.value=''" path="password" class="login-inp" required="true" minlength="8" maxlength="20" data-msg-required="Password is required."/></td>
						</tr>
						<tr>
							<th></th>
							<td valign="top"><input type="checkbox"
								class="checkbox-size" id="login-check" /><label
								for="login-check">Remember me</label></td>
						</tr>
						<tr>
							<th></th>
							<td><input type="submit" class="submit-login" /></td>
						</tr>
					</table>
				</form:form> --%>
				<input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}" />
			</div>
			<!--  end login-inner -->
			<div class="clear"></div>
			<a href="" class="forgot-pwd">Forgot Password?</a>
		</div>
		<!--  end loginbox -->

		<!--  start forgotbox ................................................................................... -->
		<div id="forgotbox">
			<div id="forgotbox-text">Please send us your email and we'll
				reset your password.</div>
			<!--  start forgot-inner -->
			<div id="forgot-inner">
			<span><label>${ForgetMsg}</label></span>
			<form name="forget"  action="findUserDetails"  method="post">
				<table>
					<tr>
						<th>Mobile Number:</th>
						<td><input  name="mobileNumber" class="login-inp" /></td>
					</tr>
					<tr>
						<th></th>
						<td><input type="submit" class="submit-login" /></td>
					</tr>
				</table>
			</form>
			</div>
			<!--  end forgot-inner -->
			<div class="clear"></div>
			<a href="" class="back-login">Back to login</a>
		</div>
		<!--  end forgotbox -->

	</div>
	<!-- End: login-holder -->
</body>
</html>