<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>List of all users</title>
</head>
<body>
<h2>List of all users <%=LocalDateTime.now()%></h2>

<sec:authorize access="isAuthenticated()">
    You are logged as: <sec:authentication property="principal.username"/>
</sec:authorize>
</body>
</html>
