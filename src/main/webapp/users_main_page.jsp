<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mullatoez
  Date: 9/14/2021
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https:kit.fontawesome.com/3da1a747b2.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Catamaran&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/simplelightbox.css">
    <link rel="stylesheet" href="css/style.css">
    <title>MrSoccer</title>

    <jsp:include page="style.jsp" />

</head>

<body id="home">
<nav class="navbar">
    <div class="container">
        <h1 class="logo"><a href="/MrSoccer/home">MrSoccer</a></h1>
        <ul class="nav">
            <li><a href="/MrSoccer/userclubs.jsp">Clubs</a></li>
            <li><a href="/MrSoccer/players">Players</a></li>
            <li><a href="/MrSoccer/managers.jsp">Managers</a></li>
            <li><a href="/MrSoccer/login">Sign Out</a></li>
        </ul>
    </div>
</nav>

<!-- Showcase -->
<section class="section-a">

    <div class="container">
        <div>
            <h5>Hi ${sessionScope.username}, welcome</h5>
            <br>
            <h3>
                <%
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
                    LocalDateTime now = LocalDateTime.now();
                    out.print("It's " + dateTimeFormatter.format(now) + " now!");
                %>
            </h3>
            <br>
            <h3>Trending news</h3>
            <h5>Shearer: Did you expect anything else from Ronaldo?</h5>
            <p>
                Alan Shearer says Cristiano Ronaldo's goalscoring return to Manchester United
                was nothing more than he and many others expected...
            </p>
            <a href="#" class="btn">Read More</a>
        </div>
        <img src="bg.jpg" alt=""/>
    </div>
</section>

<!-- Footer by include -->
<jsp:include page="footer.jsp" />

</body>

</html>