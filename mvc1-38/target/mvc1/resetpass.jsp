 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Reset password Form</title>
	<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
 <c:if test="${requestScope.resetpassalert ne null}">
	<div id="success_alert" class="alert alert-danger" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		<strong>failure!</strong> password and new password are same   
		<c:out value="${requestScope.resetpassalert}"></c:out>					
	</div>
</c:if>
<c:if test="${requestScope.resetpassalert1 ne null}">
	<div id="success_alert" class="alert alert-danger" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		<strong>failure!</strong> password not change   
		<c:out value="${requestScope.resetpassalert1}"></c:out>					
	</div>
</c:if>
<c:if test="${requestScope.chnagepassalert ne null}">
	<div id="success_alert" class="alert alert-danger" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		<strong>failure!</strong> new password and confirm password not same!  
		<c:out value="${requestScope.chnagepassalert}"></c:out>					
	</div>
</c:if> 

    <div class="container">
         <h1 class="well" id="header">Change Password Form</h1>
         <form class="form validity" action="Password">   
         	<div class="col-lg-12 well" id="header">
            	<label for="inputPassword" class="control-label">Old Password</label>
						<input type="password"  minlength="6" pattern="^[_A-z0-9]{1,}$" maxlength="12" data-missing="This field is required" data-mismatch="Please include a valid password" class="form-control"  placeholder="Enter Password"  name="oldpass"   required/>
						<div class="help-block">Minimum of 6 characters</div>	
  				<div class="form-group">
						<label>New Password :
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
 				<a href="NewFile.jsp">
     				<button type="button"class="btn btn-block btn-primary" id="sub" value="Home Page">Home Page</button>
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
 
 
 
 
 