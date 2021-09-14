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
        . navbar-nav-end {
            justify-content: end;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Mr Soccer</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/MrSoccer/home">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/MrSoccer/addTeam">Add Team</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/MrSoccer/searchTeam">Search Team</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/MrSoccer/deleteTeam">Delete Team</a>
                </li>

                <ul class="navbar-nav-end">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/MrSoccer/login">Login</a>
                </li>
                </ul>

            </ul>
        </div>
    </div>
</nav>

<table class="table table-success table-striped">
    <thead>
    <tr>
        <th scope="col">Team Id</th>
        <th scope="col">Team Coach</th>
        <th scope="col">Team Location</th>
        <th scope="col">Team League</th>
        <th scope="col">Team Name</th>
        <th scope="col">Team Level</th>

    </tr>
    </thead>

    <tbody>
    <c:forEach items="${teams}" var="team">
        <tr>
            <td>${team.id}</td>
            <th>${team.coach}</th>
            <td>${team.location}</td>
            <td>${team.league}</td>
            <td>${team.name}</td>
            <td>${team.level}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>


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