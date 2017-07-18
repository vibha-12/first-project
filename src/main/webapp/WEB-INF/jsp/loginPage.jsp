        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "s"%>
<html >
<head>
  <meta charset="UTF-8">
  <title>Login form</title>
  
  
  
  
  
  
  
      <link rel="stylesheet" href="css/style.css">

  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/clean-blog.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
  
</head>


  <body >
  <s:form action="/showHome.htm" commandName="LoginPage" method="POST">
 <br>

 
 
 <br>
 <br>
 <br>
 <br> 
  
  

			<center><h1>Login Form</h1></center>
			<center><h4><br><font color="red">${msg}</font></h4></center>
			
			<br>
			<center>	<s:input type="text" placeholder="username" required="required" path="username"  /></center>
			<br>
			
			<center>	<s:input type="password" placeholder="password" required="required" path="pwd"  /><br></center>
			<br>
			<center>	<input type="submit" value="Log in" /><br><br>
				Are you a new user? <a href="register.htm">Create Account</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<br><br>
			</center>
	
  
   
</s:form>
</body>
</html>
