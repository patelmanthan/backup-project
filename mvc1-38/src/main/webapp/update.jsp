
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>update Form</title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
    <div class="container">
		<h1 class="well" id="header">Registration Form</h1>
        <form class="form validity" action="Update" > 
         	<input type="hidden" name="user_id" value="<c:out value="${uname.user_id}"/>"/>
         	<p style="color:red;">* All Fields Are Mandatory</p>
         	<p style="color:#f4c20c;">Enter Valid Input</p>
         	<p style="color:green;">Success</p>         
         		<div class="col-lg-12 well" id="header">
        			<div class="row">
						<div class="col-sm-4 form-group">
							<label for="inputName"  class="control-label">Frist Name*</label>
							<input type="text"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" class="form-control" id="name2" data-missing="This field is required" placeholder="Enter First Name" name="fname" value="<c:out value="${uname.fname}"/>" required>
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
						<!-- <label>Password : * -->
  							<input type="hidden" id="password2" minlength="6" pattern="^[_A-z0-9]{1,}$" maxlength="12" data-missing="This field is required" data-mismatch="Please include a valid password" class="form-control" id="password2" placeholder="Enter Password"  name="password"  onkeyup='check();'  placeholder="Enter Password" value="<c:out value="${uname.password}"/>" required/>
						<!-- </label> -->
						<!-- <div class="help-block">Minimum of 6 characters</div> -->
					</div>	
					<div class="form-group">
						<!-- <label>confirm password: * -->
  							<input type="hidden"  class="form-control" id="confirm_password"  onkeyup='check();' placeholder="Confirm Password" name="renewpass" data-missing="This field is required" data-mismatch="Please include a valid password" id="password2" minlength="6" pattern="^[_A-z0-9]{1,}$" maxlength="12" required /> 
  							<span id='message'></span>
						<!-- </label>  -->
				   </div>
	                <div class="form-group">
	                	<label>Gender*</label>
	                	<div>
	                    	<div class="radio-inline">
	                        	<label>
	                            	<input name="gender" type="radio"  value="0"  ${(uname.gender eq '0')? 'checked':''} checked required>
	                           		 Male
	                        	</label>
	                    	</div>
	                    	<div class="radio-inline">
	                        	<label>
	                            	<input name="gender" type="radio"  value="1" ${(uname.gender eq '1')? 'checked':''} required>
	                           		Female
	                        	</label>
	                    	</div>
	                	</div>
	            	</div>
	            	<label for="inputName" class="control-label">Language*</label>
	    			<div class="form-group">
						<select name="language" id="inputLanguage" value="<c:out value="${uname.language}"/>" required>
							<option>English </option>
							<option>Hindi</option>
							<option>Gujarati</option>
						</select>		
					</div>
					<div class="form-group">
				 	<label>Date-of-birth*</label>
               		<div class='input-group date' id='datetimepicker1'>
                   		<input type="text" id="name2" data-missing="This field is required" class="form-control" name="dob"  id="inputLanguage" value="<c:out value="${uname.dob}"/>"required>
                    	<span class="input-group-addon">
                        	<span class="glyphicon glyphicon-calendar"></span>
                    	</span>
                	</div>
            	</div>
	           	<div class="form-group">
	            	<label>Phone*</label>
	                <input type="text" id="phone2" data-missing="This field is required"   pattern="^(0|[1-9][0-9]*)$"   maxlength="10" min="10" class="form-control" placeholder="Enter Phonenumber" name="phonenumber" value="<c:out value="${uname.phonenumber}"/>" required>
	            </div> 
				<label class="basicinfo">Residential Information</label>
       			<c:forEach items="${sessionScope.List}" var="update">  	
       				<div class="form-group multiple-form-group">
						<div class="form-group input-group">
							<input type="hidden" name="user_id" value="<c:out value="${update.user_id}"/>"/>
							<input type="hidden" name="address_id" value="<c:out value="${update.address_id}"/>"/> 
							<label>Address<span class="required">*</span></label>              		
		                   	<input type="text" class="form-control" value="<c:out value="${update.address}"/>" id="inputadd" placeholder="Enter Address" name="address"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" data-missing="This field is required" required>
							<div class="row">
								<div class="col-sm-4 form-group">
									<label>City<span class="required">*</span></label>
									<input type="text" class="form-control" value="<c:out value="${update.city}"/>" id="inputCity" placeholder="Enter City" name="city"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" data-missing="This field is required" required>
								</div>	
								<div class="col-sm-4 form-group">
									<label>State<span class="required">*</span></label>
									<input type="text" class="form-control" value="<c:out value="${update.state}"/>" id="inputCity" placeholder="Enter State" name="state"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$"  data-missing="This field is required" required>
								</div>	
								<div class="col-sm-4 form-group">
									<label>country<span class="required">*</span></label>
									<input type="text" class="form-control"  value="<c:out value="${update.country}"/>" id="inputCity" placeholder="Enter Country" name="country"  maxlength="45" minlength="1" pattern="^[a-zA-Z]+$" data-missing="This field is required" required>									
								</div>							
							</div>	
							<span class="input-group-btn"><button type="button" class="btn btn-default btn-add">+</button></span>
						</div>
					</div>
				</c:forEach>
		 		<input type='file' name="image" onchange="readURL(this);" id="image"/>
				<img id="blah" src="http://placehold.it/180" widht="150px" height="150px"  alt="your image" />
 				<button class="btn btn-block btn-primary" type="submit">Submit</button>
 				<button class="btn btn-block btn-primary" type="reset">Reset</button>
     		</div>  
		</form>  
	</div>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/locales/bootstrap-datepicker.es.min.js"></script>
	<script src="js1/jquery.validity.js"></script>
	<script src="js1/jquery.validity.js"></script>
	<script src="js1/script.js"></script>
  
</body>
</html>
 
 
 
 
 