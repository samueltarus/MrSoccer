<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- BootstrapX CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Mr Soccer Management System</title>
    <style>
        .navbar {
            font-size: 1.2rem;
            padding-top: 0.3rem;
            padding-bottom: 0.3rem;
        }

        .navbar .container{
            display: grid;
            grid-template-columns: repeat(2,1fr);
        }

        .navbar .log0 {
            font-size: 2rem;

        }

        .navbar .nav {
            justify-self: flex-end;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .navbar .nav a{
            padding: 0 1rem;
        }

        .navbar .nav a:hover {
            color: #555;
        }
    </style>
</head>
<body>

<nav class="navbar">
    <div class="container">
        <h1 class="logo"><a href="/MrSoccer/home">MrSoccer</a></h1>
        <ul class="nav">
            <li><a href="/MrSoccer/addTeam">Add Club</a></li>
            <li><a href="/MrSoccer/players">Players</a></li>
            <li><a href="/MrSoccer/managers">Managers</a></li>
            <li><a href="/MrSoccer/login">Sign Out</a></li>
        </ul>
    </div>
</nav>

<hr>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-3">
            <div class="card-body">
                <p>Welcome home</p>
            </div>
        </div>
        <div class="col-md-6">
            <div class="card-body">
                <table class="table table-success table-striped">
                    <thead>
                    <tr>
                        <th scope="col">Club Coach</th>
                        <th scope="col">Club League</th>
                        <th scope="col">Club Name</th>

                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach items="${clubs}" var="club">
                        <tr>
                            <th>${club.coach}</th>
                            <td>${club.league}</td>
                            <td>${club.name}</td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>

        <div class="col-md-3">
            <h3>Hello</h3>
        </div>
    </div>
</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>

</body>
</html>