<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en-AU">
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<div id="content" style="padding-top: 5cm">
		<div class="box">
			<div class="middle" id="login">
				<div class="post">
					<p>
						<span>Login to our System</span>
					</p>
					<p>Please enter your user name and password.</p>
				</div>
				<form name='f' action="<c:url value='j_spring_security_check' />"
					method='POST'>
					<table>
						<tr>
							<td><s:label key="label.username" /></td>
							<td><input type='text' name='j_username' value=''></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><input type='password' name='j_password' /></td>
						</tr>
						<tr>
							<td colspan='2'><input name="submit" type="submit"
								value="Submit" /> <input name="Reset" type="reset" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>


</body>
</html>