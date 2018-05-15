 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Registration Form</title>
	<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<%request.getAttribute("sameemailid"); %>
<c:if test="${requestScope.sameemailid ne null}">
	<div id="success_alert" class="alert alert-danger" role="alert">
		<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		<strong>failure!</strong> Email Id is already exited !    
		<c:out value="${requestScope.sameemailid}"></c:out>					
	</div>
</c:if>
<div class="container">	
	<h1 class="well" id="header">Registration Form</h1>
    <form class="form validity" action="Controller" method="post" enctype="multipart/form-data"> 
  		<p  style="color:red;">* All Fields Are Mandatory</p>
      	<p  style="color:#f4c20c;">Enter Valid Input</p>
       	<p  style="color:green;">Success</p>
        <div class="col-lg-12 well" id="header">
        	<div class="row">
				<div class="col-sm-4 form-group">
					<label for="inputName"  class="control-label">Frist Name*</label>
					<input type="text"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" class="form-control" id="name2" data-missing="This field is required" placeholder="Enter First Name" name="fname"  value="<c:out value="${uname.fname}"/>" required>
				</div>
				<div class="col-sm-4 form-group">
					<label for="inputName" class="control-label">Middle Name*</label>
					<input type="text" maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" class="form-control" id="name2" data-missing="This field is required" placeholder="Enter Middle Name" name="mname" value="<c:out value="${uname.mname}"/>" required>
				</div>
				<div class="col-sm-4 form-group">
					<label for="inputName"  class="control-label">Last Name*</label>
					<input type="text" maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" class="form-control" id="name2" data-missing="This field is required" placeholder="Enter Last Name" name="lname" value="<c:out value="${uname.lname}"/>" required>
				</div>
			</div>
            <div class="form-group">
               	<label for="email2">E-mail*</label>
               	<input id="email2" name="emailid" maxlength="45" minlength="10" class="form-control" data-missing="This field is required" data-mismatch="Please include a valid email" placeholder="Enter Email Id" type="email" value="<c:out value="${uname.emailid}"/>" required>
           	</div>
			<div class="form-group">
				<label>Password : *
  					<input type="password" id="password2" minlength="6" pattern="^[_A-z0-9]{1,}$" maxlength="12" data-missing="This field is required" data-mismatch="Please include a valid password" class="form-control" id="password2" placeholder="Enter Password"  name="password"  onkeyup='check();'  placeholder="Enter Password"  required/>
				</label>
				<div class="help-block">Minimum of 6 characters</div>
			</div>	
			<div class="form-group">
				<label>confirm password: *
  					<input type="password"  class="form-control" id="confirm_password"  onkeyup='check();' placeholder="Confirm Password" name="renewpass" data-missing="This field is required" data-mismatch="Please include a valid password" id="password2" minlength="6" pattern="^[_A-z0-9]{1,}$" maxlength="12" required /> 
  					<span id='message'></span>
				</label> 
			</div>
 			<div class="form-group">
               	<label>Gender*</label>
               	<div>
                   	<div class="radio-inline">
                      	<label>
                           	<input name="gender" type="radio" value="0" ${(uname.gender eq '0')? 'checked':''} required>
                       		 Male
                       	</label>
                    </div>
                    <div class="radio-inline">
                       	<label>
                           	<input name="gender" type="radio" value="1" ${(uname.gender eq '1')? 'checked':''} required>
                       		Female
                       	</label>
                   	</div>
               	</div>
            </div>
            <label for="inputName" class="control-label">Language*</label>
    		<div class="form-group">
				<select name="language" id="inputLanguage" required>
					<option>English </option>
					<option>Hindi</option>
					<option>Gujarati</option>
				</select>		
			</div>
           	<div class="form-group">
            	<label>Date-of-birth*</label>
               	<div class='input-group date' id='datetimepicker1'>
                 	<input type="text" id="name2" data-missing="This field is required" class="form-control" name="dob" placeholder="Enter date of birth " id="inputLanguage" value="<c:out value="${uname.dob}"/>" required>
                    <span class="input-group-addon">
                       	<span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
            </div>
            <div class="form-group">
                <label>Phone*</label>
                <input type="text" id="quantity" data-missing="This field is required"    maxlength="10" minlength="10" class="form-control" placeholder="Enter Phonenumber" name="phonenumber" value="<c:out value="${uname.phonenumber}"/>" required>
            	<span id="errmsg"></span>
            </div> 
			<label class="basicinfo">Residential Information</label>	
			<div class="form-group multiple-form-group">
				<div class="form-group input-group">
					<label>Address<span class="required">*</span></label>              		
	               	<input type="text" class="form-control" id="inputadd" placeholder="Enter Address" name="address"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" data-missing="This field is required" value="<c:out value="${uname.address}"/>" required>
					<div class="row">
						<div class="col-sm-4 form-group">
							<label>City<span class="required">*</span></label>
							<input type="text" class="form-control" id="inputCity" placeholder="Enter City" name="city"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" data-missing="This field is required" value="<c:out value="${uname.city}"/>" required>
						</div>	
						<div class="col-sm-4 form-group">
							<label>State<span class="required">*</span></label>
							<input type="text" class="form-control" id="inputCity" placeholder="Enter State" name="state"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$"  data-missing="This field is required" value="<c:out value="${uname.state}"/>" required>
						</div>	
						<div class="col-sm-4 form-group">
							<label>country<span class="required">*</span></label>
							<input type="text" class="form-control" id="inputCity" placeholder="Enter Country" name="country"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" data-missing="This field is required" value="<c:out value="${uname.country}"/>" required>									
						</div>							
					</div>	
					<span class="input-group-btn"><button type="button" class="btn btn-default btn-add">+</button></span>
				</div>
			</div>
			 <input type='file' name="image" onchange="readURL(this);" id="image"/>
			<img id="blah" src="http://placehold.it/180" widht="150px" height="150px"  alt="your image" />	
	 		<button class="btn btn-block btn-primary" type="submit">Submit</button>
	 		<button class="btn btn-block btn-primary" type="reset">Reset</button>		
	   	</div>	  
	</form>  
</div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/locales/bootstrap-datepicker.es.min.js"></script>
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
 

 
 