<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Index Page</title>

</head>
<body>
	<h1 style="text-align:center;">Welcome to Home Page of Servlet</h1>

	<%=new Date().toLocaleString()%>

	<h1>
		<a href="example"> Example Servlet</a>
	</h1>
	<br>
	<h1>
		<a href="myGenericServlet"> Generic Servlet</a>
	</h1>
	
	<br> Server Version:
	<%=application.getServerInfo()%><br> Servlet Version:
	<%=application.getMajorVersion()%>.<%=application.getMinorVersion()%><br>
	JSP Version:<%=JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion()%>
	<br>

</body>

</html>