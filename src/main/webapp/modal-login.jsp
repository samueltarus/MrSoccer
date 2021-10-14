<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <jsp:include page="css/modal-login-style.jsp"/>
</head>

<div id="loginForm" class="container"></div>



<script>

    <jsp:include page="js/lib.kevin.js"/>
    <jsp:include page="js/login.js"/>

</script>

</body>
</html>

<%--<h2>Login Form</h2>

<form action="./login" method="post">
    <div class="imgcontainer">
        <img src="login.jpg" alt=""/>
    </div>

    <div class="container">
        <label for="username"> <b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="username" id="username" required>

        <label for="password"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" id="password" required>

        <button type="submit">Login</button>
    </div>
</form>--%>
