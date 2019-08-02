<%--/
  Created by IntelliJ IDEA.
  User: clement
  Date: 12/07/19
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>




<body>
<div class ="container-fluid">
    <div class = "row justify-content-center">

        <div class="col-8">
            <title>Our GitHubers</title>
            <table class="table table-blue" style="margin-top: 10vh">
                <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Avatar Url</th>
                    <th scope="col">Login </th>

                </tr>
                <c:forEach items="${githubers}" var="githuber">
                    <tr>
                        <td>${githuber.name} </td>
                        <td>${githuber.email}</td>
                        <td><img src=${githuber.avatarUrl} style="width: 200px; height:200px;"></td>
                        <td>${githuber.login}</td>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>
</div>

</body>
</html>
