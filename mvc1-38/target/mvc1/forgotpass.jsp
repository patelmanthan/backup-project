 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Forgot password Form</title>
	<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<c:if test="${requestScope.forgotalert ne null}">
	<div id="success_alert" class="alert alert-danger" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		<strong>failure!</strong> Password not change successfully!  
		<c:out value="${requestScope.forgotalert}"></c:out>					
	</div>
</c:if>
<c:if test="${requestScope.passalert ne null}">
	<div id="success_alert" class="alert alert-danger" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		<strong>failure!</strong> new password and confirm password not same!  
		<c:out value="${requestScope.passalert}"></c:out>					
	</div>
</c:if>
    <div class="container">
        <h1 class="well" id="header">Forgot Password Form</h1>
        <form class="form validity" action="Forgotpass">
        <div class="col-lg-12 well" id="header">	
      		<div class="form-group">
                <label for="email2">E-mail</label>
                <input id="email2" name="emailid" class="form-control" data-missing="This field is required" data-mismatch="Please include a valid email" placeholder="Enter Email Id" type="email" required>
            </div>
  			<div class="form-group">
				<label> Password :
  					<input type="password" id="password2" minlength="6" pattern="^[_A-z0-9]{1,}$" maxlength="12" data-missing="This field is required" data-mismatch="Please include a valid password" class="form-control" id="password2" placeholder="Enter Password"  name="newpass"  onkeyup='check();'  placeholder="Enter Password"  required/>
				</label>
				<div class="help-block">Minimum of 6 characters</div>
			</div>	
			<div class="form-group">
				<label>confirm password:
  					<input type="password"  class="form-control" id="confirm_password"  onkeyup='check();' placeholder="Confirm Password" name="renewpass" required /> 
  					<span id='message'></span>
				</label> 
			</div>		
 			<button class="btn btn-block btn-primary" type="submit">Submit</button><br/>
 			<a href="login.jsp">
     			<button type="button"class="btn btn-block btn-primary" id="sub" value="Login Page">Login Page</button>
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
 
 
 
 
 