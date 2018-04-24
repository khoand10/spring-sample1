<%--
  Created by IntelliJ IDEA.
  User: DangKhoa
  Date: 4/22/2018
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="${pageContext.servletContext.contextPath}/">
</head>
<body>
    <img src="/images/ava.jpg"><br>
    <img src="/images/${name}">
    File Name:${name}
    File Size:${size}
    File Type:${type}
</body>
</html>
