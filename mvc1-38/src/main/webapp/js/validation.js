function validation(){
	var fname= (document.getElementById("firstname").value);
	var lname= (document.getElementById("lastname").value);
	var emailid= (document.getElementById("emailid").value);
	var password= (document.getElementById("password").value);
	var conformpassword=(document.getElementById("conformpassword").value);
	var hobby= (document.getElementById("hobby").checked);
	var hobby1= (document.getElementById("hobby1").checked);
	var hobby2= (document.getElementById("hobby2").checked);
	var technology= (document.getElementById("technology").value);
	var img= (document.getElementById("img").value);

 
	 if (fname=="") {
		document.getElementById("fnameval").innerHTML="enter first name";
	}

	 if (lname=="") {
		document.getElementById("lnameval").innerHTML="enter last name";
	}
	 if (emailid=="") {
		document.getElementById("emailval").innerHTML="enter last name";
	}
	 if(password.length<6 || password.length>12 ||  !/[0-9]/.test(Password) || !/[A-Z]/.test(Password)){  
  		document.getElementById("passval").innerHTML="Password must be at least 6 characters long.";
  } 
    if (conformpassword != password) {
		document.getElementById("conpassval").innerHTML="password does not match";
	} 

	if(gender[0].checked==false && gender[1].checked==false)
	{
		document.getElementById("genderval").innerHTML="select value";
		
	}
	if (technology=="select") {
		document.getElementById("techval").innerHTML="select field";
	}
 	if (hobby==false && hobby1==false && hobby2==false) {
		document.getElementById("hobbyval").innerHTML="enter hobby";
	}
  
     if (img=="") {
		document.getElementById("imgval").innerHTML="no image found";
	}
}

