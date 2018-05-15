<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
	<meta http-equiv="Pragma" content="no-cache" />
	<meta http-equiv="Expires" content="-1" />
<title>Insert title here</title>
</head>
<body>
 <div class="container">
 
 <!-- Email Id or Password Invalid alert -->
<%-- <%if(request.getAttribute("alertboxx")==null){ 	
				}
				else{
			   %>
			  	<div class="alert alert-danger" role="alert">
		  			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		 			<strong>failure!</strong> Email Id or Password Invalid!  
				</div>
		 		<script type="text/javascript">
		 			window.setTimeout(function() {
			    		$(".alert").fadeTo(500, 0).slideUp(500, function(){
			        		$(this).remove(); 
			    		});
					}, 4000);
		 		</script>
			   <%    
				}
				%> --%>
				<!-- logout successfully alert -->
				<%-- <%if(request.getAttribute("logout")==null){ 	
				}
				else{
			   %>
			  	<div class="alert alert-success" role="alert">
		  			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		 			<strong>Success!</strong> You have been logout successfully!  
				</div>
		 		<script type="text/javascript">
		 			window.setTimeout(function() {
			    		$(".alert").fadeTo(500, 0).slideUp(500, function(){
			        		$(this).remove(); 
			    		});
					}, 4000);
		 		</script>
			   <%    
				}
				%>	
				
				<!-- registration successfully alert -->		
				<%if(request.getAttribute("alertbox")==null){ 	
				}
				else{		
	 			 %>
	   			<div class="alert alert-success" role="alert">
  					<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
  					<strong>Success!</strong> You have been registration successfully!
				</div>
 				<script type="text/javascript">
 					window.setTimeout(function() {
	    			$(".alert").fadeTo(500, 0).slideUp(500, function(){
	        			$(this).remove(); 
	    				});
					}, 4000);
 				</script>
			   <%    
				}
				%>
 --%>				<!-- Password change successfully alert -->
				<%-- <%if(request.getAttribute("alertbox2")==null){ 	
				}
				else{
			   %>
			 	<div class="alert alert-success" role="alert">
		  			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		  			<strong>Success!</strong> Password change successfully! 
				</div>
		 		<script type="text/javascript">
		 			window.setTimeout(function() {
			    		$(".alert").fadeTo(500, 0).slideUp(500, function(){
			        		$(this).remove(); 
			    		});
					}, 4000);
		 		</script>
			   <%    
				}
				%> --%>
				
				<!-- Password not change successfully alert -->	
				<%-- <%if(request.getAttribute("forgotalert")==null){ 	
				}
				else{
	   			%>
			   	<div class="alert alert-danger" role="alert">
		  			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		  			<strong>failure!</strong> Password not change successfully!  
				</div>
			 	<script type="text/javascript">
			 		window.setTimeout(function() {
				    	$(".alert").fadeTo(500, 0).slideUp(500, function(){
				        	$(this).remove(); 
				   	 });
					}, 4000);
				</script>
			   <%    
				}
				%> --%>
				
				<!-- password and new password are same alert -->	
	<%-- 			<%if(request.getAttribute("resetpassalert")==null){ 	
				}
				else{
			   %>
			   	<div class="alert alert-danger" role="alert">
		  			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		  			<strong></strong> password and new password are same
				</div>
				<script type="text/javascript">
					 window.setTimeout(function() {
						    $(".alert").fadeTo(500, 0).slideUp(500, function(){
					    	    $(this).remove(); 
					   	 });
						}, 4000);
				 </script>
			   <%    
				}
				%>
				
				<!-- password not change alert -->
		        <%if(request.getAttribute("resetpassalert1")==null){
				}
				else{
			   %>
			   	<div class="alert alert-danger" role="alert">
		  			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		  			<strong></strong> password not change
		   
				</div>
				 <script type="text/javascript">
				 window.setTimeout(function() {
					    $(".alert").fadeTo(500, 0).slideUp(500, function(){
					        $(this).remove(); 
					    });
					}, 4000);
				 </script>  
			   <%    
				}
				%>  --%>
				
				<!-- Email Id is already exited alert -->	
		<%-- 		<%if(request.getAttribute("sameemailid")==null){ 	
				}
				else{	
				 %>
				
			 	<div class="alert alert-danger" role="alert">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
					<strong>failure!</strong> Email Id is already exited !  
				</div>
				<script type="text/javascript">
		 			window.setTimeout(function() {
			    		$(".alert").fadeTo(500, 0).slideUp(500, function(){
				        		$(this).remove(); 
					   		});
						}, 4000);
				</script>
				<%    
				}
				%> --%>
				
				
				<%-- <%if(request.getAttribute("passalert")==null){ 	
				}
				else{
			   %>
			  	<div class="alert alert-danger" role="alert">
		  			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		 			<strong>failure!</strong> new password and confirm password not same!  
				</div>
		 		<script type="text/javascript">
		 			window.setTimeout(function() {
			    		$(".alert").fadeTo(500, 0).slideUp(500, function(){
			        		$(this).remove(); 
			    		});
					}, 4000);
		 		</script>
			   <%    
				}
				%> --%>
				<%--  <%if(request.getAttribute("chnagepassalert")==null){ 	
				}
				else{
			   %>
			  	<div class="alert alert-danger" role="alert">
		  			<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
		 			<strong>failure!</strong> new password and confirm password not same!  
				</div>
		 		<script type="text/javascript">
		 			window.setTimeout(function() {
			    		$(".alert").fadeTo(500, 0).slideUp(500, function(){
			        		$(this).remove(); 
			    		});
					}, 4000);
		 		</script>
			   <%    
				}
				%> 
				   <%if(request.getAttribute("resetpass")==null){ 	
			System.out.println("done");
		}
		else{
		System.out.println("dfdfd");
		
	   %>
	   <div class="alert alert-success" role="alert">
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
  <strong>Success!</strong> You have been change password successfully!
   
</div>
 <script type="text/javascript">
 window.setTimeout(function() {
	    $(".alert").fadeTo(500, 0).slideUp(500, function(){
	        $(this).remove(); 
	    });
	}, 4000);
 </script>
	   
	   <%    
		}
		%> --%>		 	
</div>				
</body>
</html>