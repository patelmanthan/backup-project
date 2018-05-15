<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>signin Form</title>
	<jsp:include page="header.jsp"></jsp:include>
	<script>
	window.history.forward();
	function noBack() { window.history.forward(); }
	</script>
</head>
</head>
<body onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload="">
<c:if test="${requestScope.logout ne null}">
	<div id="success_alert" class="alert alert-success" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		<strong>Success!</strong> You have been logout successfully!    
		<c:out value="${requestScope.logout}"></c:out>					
	</div>
</c:if>
<c:if test="${requestScope.alertbox ne null}">
	<div id="success_alert" class="alert alert-success" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		<strong>Success!</strong> You have been logout successfully!    
		<c:out value="${requestScope.alertbox}"></c:out>					
	</div>
	  <c:if test="${requestScope.alertbox2 ne null}">
		<div id="success_alert" class="alert alert-success" role="alert">
			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
			<strong>Success!</strong> Password change successfully!   
			<c:out value="${requestScope.alertbox2}"></c:out>					
		</div>
	</c:if> 
</c:if>
<c:if test="${requestScope.alertboxx ne null}">
	<div id="success_alert" class="alert alert-danger" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		<strong>failure!</strong> Email Id or Password Invalid!    
		<c:out value="${requestScope.alertboxx}"></c:out>					
	</div>
</c:if>
    <div class="container">
		<h1 class="well" id="header">Login Form</h1>    
        <form class="form validity" action="Filteradmin">
			<div class="col-lg-12 well" id="header">	
				<div class="form-group">
		     		<label for="email2">E-mail</label>
		            <input id="email2" name="login_emailid" class="form-control" data-missing="This field is required" data-mismatch="Please include a valid email" placeholder="Enter Email Id" type="email" value="<c:out value="${uname.login_emailid}"/>" required>
		        </div>	
				<div class="form-group">
					<label>Password :
		  				<input type="password" id="password2" minlength="6" pattern="^[_A-z0-9]{1,}$" maxlength="12" data-missing="This field is required" data-mismatch="Please include a valid password" class="form-control" placeholder="Enter Password"  name="login_password"  onkeyup='check();'  required/>
					</label>
					<div class="help-block">Minimum of 6 characters</div>
				</div>	
				<input type="checkbox" name="remember_me" id="remember_me" checked="checked" class="hidden">
				<a href="forgotpass.jsp" class="btn btn-link pull-right">Forgot Password?</a>
		 		<button class="btn btn-block btn-primary" type="submit">Submit</button><br/>
		 		<a href="registration.jsp">
     				<button type="button"class="btn btn-block btn-primary" id="sub" value="Registration Page">Registration Page</button>
         		</a>
		     </div>  
		</form>  
	</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js1/jquery.validity.js"></script>
<script src="js1/script.js"></script>
<script type="text/javascript">
	window.setTimeout(function() {
		$(".alert").fadeTo(500, 0).slideUp(500, function(){
			$(this).remove(); 
		});
	}, 4000);
</script>
</body>
</html>
 
 
 
 
 