<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN UP</title>
<!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/clean-blog.min.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>


 <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/clean-blog.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
  


</head>
<!--  <body style="background-image: url('img/33.jpg'); background-size: 100%">-->
<body>
  
  <s:form name="myForm" action="/saveProfile.htm" commandName="RegisterCMD" method="POST">
          <br>  <br> <br> <p align="center"><h1><u><font color="black"><center>REGISTRATION FORM</center></font></u></h1> </p><br>
            <center>
                          <s:label path="username"><font color="black">Username</font></s:label>
                            &nbsp;&nbsp;&nbsp;
                           
                            
                            <s:input type="text"  placeholder="userame" id="name" name="nameField" path="username" required="required"/>
                       </center>
                   <br><center>
                     <s:label path="pwd"><font color="black">Password</font></s:label>&nbsp;&nbsp;&nbsp;&nbsp;
                            <s:input type="text"  placeholder="password" id="password" name="password" path="pwd" required="required" />
                      </center>
                    <br>
                        <center>   <s:button type="submit" class="btn btn-default">SAVE</s:button></center> 
                        <br>
                      <center>Already have an account?<a href="showLogin.htm"> Click here</a></center>
    </s:form>
 </body>
 </html>