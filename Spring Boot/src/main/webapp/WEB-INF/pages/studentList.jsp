<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASGARLI
  Date: 15.01.2020
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student List of Management</h1>


<c:forEach items="${studentList}" var="ms">
    ${ms.name} <br>
    ${ms.surname}

</c:forEach>
</body>
</html>
