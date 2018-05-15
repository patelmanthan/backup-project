<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User update registration form</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
	body{
  		padding: 50px;
	}
</style>
</head>
<body>
<div class="container">
	<div class="row">
   		<div class="span12">
    		<div class="head">
        		<div class="row-fluid">
            		<div class="span12">
                		<div class="span6">
                    		<h1 class="muted">demo project</h1>
                		</div>
                		<div class="span4 offset2" style="margin-top:15px;">
                     		<form action="Logout1">
             	  				<input type="submit" class="btn pull-right" value="Logout">
          					</form>
               		 	</div>
            		</div>
        		</div>
      		</div>
    	</div>
  	</div>
</div> 
    <div class="container">
     	<p><h4 id="font1"><center> <br>Update user registration form</center></h4>
		<table id="example" class="table table-striped table-bordered" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th> user_id </th>
					<th> fname </th>
					<th> mname </th>
					<th> lname </th>
					<th> Edit </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${sessionScope.List}" var="data"> 
					<tr>
						<th><c:out value="${data.user_id}"/> </th> 
						<th><c:out value="${data.fname}"/> </th>
						<th><c:out value="${data.mname}"/> </th>
						<th><c:out value="${data.lname}"/> </th>
					 	<td><a href="User_edit?user_id=<c:out value='${data.user_id }'/>">edit</a></td> 	
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div id="btnsize">
			<div class="col-lg-12" >
				<a href="NewFile.jsp">
     				<button type="button"class="btn btn-block btn-primary" id="sub" value="Back to  home Page">Back  Home Page</button>
        		</a>
   			</div>
		</div>
   </div>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type='text/javascript' src='js/table.js'></script>
</body>
</html>

