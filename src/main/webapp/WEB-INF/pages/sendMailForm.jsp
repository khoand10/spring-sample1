<%--
  Created by IntelliJ IDEA.
  User: DangKhoa
  Date: 4/22/2018
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Send mail</title>
</head>
<body>
${message}
<form action="/send" method="post">
    <p>
        <input name="from" placeholder="From">
    </p>
    <p>
        <input name="to" placeholder="To">
    </p>
    <p>
        <input name="subject" placeholder="Subject">
    </p>
    <p>
        <textarea name="body" placeholder="Body" rows="3" cols="30"></textarea>
    </p>
    <button>Send</button>
</form>
</body>
</html>
