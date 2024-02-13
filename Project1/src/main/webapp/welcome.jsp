<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


    <%@  page import = "java.util.ArrayList" %>
    <%@  page import = "dto.Product" %>
    
    
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet"
	href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.css">
	
<meta charset="EUC-KR">

<title>Insert title here</title>

</head>
<body>
	
<nav class = "navbar navbar-expend navbar-dark bg-dark">
	<div class = "container">
		<div class = "navbar-header">
		<a class = "navbar-brand" href="./welcome.jsp">Home</a>
		</div>	
	</div>
</nav>
	
	
	<%!	 	String greeting = "Welcome to Web Server Mall";
			String tagline = "Welcome to Web Market";			%>
	
	
	<div class = "jumbotron">
		<div class = "contrainer">
			<h1><%= greeting  %></h1>
		</div>
	</div>
	
	
	
	
	<div class = "container">
		<div class = "text-center">
			<h3><%= tagline  %></h3>
		</div>
	</div>
	
	
	
	
	<footer class = "containter">
		<p>&copy; WebMarket</p>	
	</footer>
	


</body>
</html>