<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/18
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  action="/update" method="post">

    <input type="hidden" name="id" value="${s.id}">
    姓名<input type="text" name="name" value="${s.name}">
    性别<input type="text" name="sex" value="${s.sex}">
    地址<input type="text" name="address" value="${s.address}">
    <input type="submit" value="确定">
</form>
</body>
</html>
