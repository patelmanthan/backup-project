<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Demo Project</title>
    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font.css" rel="stylesheet">
    <!-- Custom fonts for this template -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Cabin:700' rel='stylesheet' type='text/css'>
    <!-- Custom styles for this template -->
    <link href="css/grayscale.min.css" rel="stylesheet">
  </head>
  <body id="page-top">

   	<!-- Navigation -->
   	<nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger">DEMO PROJECT</a>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <!-- Intro Header -->
    
    <header class="masthead">
      <div class="intro-body">
        <div class="container">
        <c:if test="${requestScope.resetpass ne null}">
			<div id="success_alert" class="alert alert-success" role="alert">
				<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"onclick="location.href = 'login.jsp'">&times;</span></button>
				<strong>Success!</strong> Password change successfully!   
				<c:out value="${requestScope.resetpass}"></c:out>					
			</div>
		</c:if> 
        <%-- <jsp:include page="alert.jsp"></jsp:include>  --%>
          <div class="row">
            <div class="col-lg-8 mx-auto">
              <h4 class="brand-heading" id="font">Welcome</h4>
              <h4 class="brand-heading"id="font">User</h4>
               <p><h4 id="font1"> <br>Show all user data Please click below</h4>
              <a href="table1.jsp">
     			<button type="button" class="btn btn-success">Click here</button>
              </a>
              <p><h4 id="font1"> <br>Change Password Please click below</h4>
              <a href="resetpass.jsp">
     			<button type="button" class="btn btn-success">Click here</button>
              </a>     
            </div>
          </div>
        </div>
      </div>
    </header>
    <!-- Footer -->
    <footer>
      <div class="container text-center">
        <p>Copyright &copy; Your Website 2018</p>
      </div>
    </footer>
    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRngKslUGJTlibkQ3FkfTxj3Xss1UlZDA&sensor=false"></script>

    <!-- Custom scripts for this template -->
    <script src="js/grayscale.min.js"></script>
    <script type="text/javascript">
		window.setTimeout(function() {
			$(".alert").fadeTo(500, 0).slideUp(500, function(){
				$(this).remove(); 
			});
		}, 4000);
	</script>
  </body>
</html>
    