<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Unicode characters</h2>
    <!-- Scriptlets for java statements -->
    <%
        for(int i = 2305; i <= 3200; i++) {
    %>
        Character for <%= i %> is &#<%= i %>; <br />
    <%
        }
    %>
</body>
</html>