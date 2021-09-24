<%--
  Created by IntelliJ IDEA.
  User: Mullatoez
  Date: 9/24/2021
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Delete Manager</h1>
<form action="/MrSoccer/deleteManager" method="post">

    <h3>Delete Manager</h3>
    <hr>
    <div class="mb-3">
        <label for="name" class="form-label">Manager Name</label>
        <input type="text" class="form-control" id="name" name="name">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>

</body>
</html>
