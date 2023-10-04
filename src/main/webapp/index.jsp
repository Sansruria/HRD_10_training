<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <jsp:include page="header.jsp"></jsp:include>
    
    <h1>Hello, World!</h1>
    <c:forEach begin="1" end="5" step="1">
        <c:set var="i" value="${i+1}"></c:set>
            <p>${i}</p>
    </c:forEach>
    
    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>