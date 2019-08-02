<%--
  Created by IntelliJ IDEA.
  User: clement
  Date: 02/08/2019
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>Title</title>


</head>
<body>
<div class="container-fluid" style="margin-top: 10vh">
    <div class="row justify-content-center">
<form action="log" class="col-3 border border-info" method="post">
    <div class="row justify-content-center">
    <label> Sair le login d'un githuber : </label>
        <div class="w-100"></div>
    <input type="text" name="login">
    <div class="w-100"></div>
    <button type="submit" class="btn btn-primary"  style="margin-top: 10px">Envoyer</button>
    </div>
</form>
    </div>
</div>
</body>
</html>
