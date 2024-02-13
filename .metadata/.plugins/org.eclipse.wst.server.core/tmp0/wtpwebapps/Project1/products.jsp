<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Product" %>  
<%@ page import="dao.ProductRepository" %>

<!DOCTYPE html>

<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />

<html>
<head>

<link rel = "stylesheet" 
	  href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.css">
	  
<meta charset="EUC-KR">
<title>��ǰ���</title>
</head>
<body>

	<jsp:include page = "menu.jsp" />
	<div class = "jumbotron">
		<div class = " container" >
			<center><h1 class = "display-3">��ǰ���</h1></center>
		</div>
	</div>
		
	<% 
		String id = request.getParameter("id");
		ProductRepository dao = ProductRepository.getInstance();
	
		ArrayList<Product> listOfProducts = 
		productDAO.getAllProducts();
	%>
	
	
	
		
	<div class = "container">
		<div class = "row" align="center">
		
			<%
				for (int i=0; i<listOfProducts.size(); i++){
					Product product = listOfProducts.get(i);					
			%>
		
			
		<div class = "col=md-4">
			<h3><%= product.getPname() %></h3>
			<p><%= product.getDescription() %>
			<p><%= product.getUnitPrice() %> ��
		</div>
			
		<%
				}
			%>
		</div>
		<hr> 	
	</div>
		<jsp:include page ="footer.jsp" />
</body>
</html>