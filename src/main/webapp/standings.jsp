<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

    <!-- BootstrapX CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>MrSoccer</title>

    <jsp:include page="style.jsp" />

</head>

<body id="home">
<nav class="navbar">
    <div class="container">
        <h1 class="logo"><a href="/MrSoccer/home">MrSoccer</a></h1>
        <ul class="nav">
            <li><a href="/MrSoccer/players">Players</a></li>
            <li><a href="/MrSoccer/managers">Managers</a></li>
            <li><a href="/MrSoccer/clubs">Clubs</a></li>
            <li><a href="/MrSoccer/login">Sign Out</a></li>
        </ul>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-5">

            <div class="card">

                <div class="card-header">
                    Trending news
                </div>
                <div class="card-body">
                    <h5>The ponderous Arsenal</h5>
                    <p>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Maxime mollitia,
                        molestiae quas vel sint commodi repudiandae consequuntur voluptatum laborum
                        numquam blanditiis harum quisquam eius sed odit fugiat iusto fuga praesentium
                        optio, eaque rerum! Provident similique accusantium nemo autem. Veritatis
                        obcaecati tenetur iure eius earum ut molestias architecto voluptate aliquam
                        nihil, eveniet aliquid culpa officia aut! Impedit sit sunt quaerat, odit,
                        tenetur error, harum nesciunt ipsum debitis quas aliquid. Reprehenderit,
                    </p>

                    <img src="https://i2-prod.football.london/incoming/article21536235.ece/ALTERNATES/s615/0_GettyImages-1339342919.jpg" alt="Chelsea"/>
                </div>
            </div>

            <div class="card">
                <div class="card-header">
                    Arsenal latest transfer news
                </div>
                <div class="card-body">
                    <h5>Will Jude Bellingham sign for the weakest club in England?</h5>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias dolores nobis voluptatibus.
                        Aliquid asperiores beatae earum perferendis quasi. Autem debitis dolores est molestias nam
                        provident quia repellendus sit. Expedita, modi.
                    </p>

                    <img src="https://i2-prod.football.london/incoming/article21585159.ece/ALTERNATES/s615/0_Bellingham-Arsenal.png" alt="Chelsea"/>
                </div>
            </div>

        </div>
        <div class="col-md-7">

            <div class="card">
                <div class="card-body">
                    <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search club.." title="Type in a name">
                    <table id="myTable" class="table table-dark table-hover">
                        <thead>
                        <tr>
                            <th scope="col">Club</th>
                            <th scope="col">MP</th>
                            <th scope="col">Position</th>
                            <th scope="col">Points</th>

                        </tr>
                        </thead>

                        <tbody>
                        <c:forEach items="${standings}" var="standings">
                            <tr>
                                <td>${standings.clubName}</td>
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
    </div>
</div>

<script>
    function myFunction() {
        var input, filter, table, tr, td, i, txtValue;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[0];
            if (td) {
                txtValue = td.textContent || td.innerText;
                if (txtValue.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                } else {
                    tr[i].style.display = "none";
                }
            }
        }
    }
</script>

<!-- Footer by include -->
<jsp:include page="footer.jsp" />

</body>
</html>