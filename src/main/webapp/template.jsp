<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <!-- BootstrapX CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Standings</title>
</head>
<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-3">

        </div>

        <div class="col-md-7">

            <div class="card">
                <div class="card-body">
                    <table class="table table-success table-striped">
                        <thead>
                        <tr>
                            <th scope="col">Club Name</th>
                            <th scope="col">Games Played</th>
                            <th scope="col">Club Position</th>
                            <th scope="col">Club Points</th>

                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${standings}" var="standings">
                            <tr>
                                <th>${standings.clubName}</th>
                                <td>${standings.gamesPlayed}</td>
                                <td>${standings.clubPosition}</td>
                                <td>${standings.clubPoints}</td>
                            </tr>
                        </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>

        </div>

        <div class="col-md-3">

        </div>
    </div>
</div>

</body>
</html>
