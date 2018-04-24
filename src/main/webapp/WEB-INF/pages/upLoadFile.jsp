<%--
  Created by IntelliJ IDEA.
  User: DangKhoa
  Date: 4/22/2018
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Up Load File</title>
</head>
<body>
    <h2>Up Load Avatar</h2>
    ${message}
        <form action="/upFile" method="post" enctype="multipart/form-data">
        File: <input type="file" name="images"><br>
        <button>UpLoad</button>
    </form>
</body>
</html>
