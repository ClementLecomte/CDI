<%--
  Created by IntelliJ IDEA.
  User: clement
  Date: 12/07/19
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="WEB-INF/header.jsp" %>




<body>
<title>Our GitHubers</title>
<table class="table table-dark">
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Description</th>
        <th scope="col">Login</th>
    </tr>
    <c:forEach items="${list}" var="githuber">
        <tr>
            <td>${githuber.name} </td>
            <td>${githuber.email}</td>
            <td>${githuber.name}</td>
            <td>${githuber.avatarUrl}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
