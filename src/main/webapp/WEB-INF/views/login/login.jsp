<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
<title>
    Login
</title>
<body>
<form class="table_dark">
    <a href=${pageContext.request.contextPath}"/drivers/add">Register</a>
</form>
<form class="table_dark" method="post" action="${pageContext.request.contextPath}/login">
    Login <input type="text" name="login">
    Password <input type="password" name="password">
    <button type="submit">Confirm</button>
    <h4 style="color:red">${errorMsg}</h4>
</form>
</body>
</html>
