<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

    <jsp:include page="style.jsp"/>

</head>

<body id="home">
<nav class="navbar">
    <div class="container">
        <h1 class="logo"><a href="/MrSoccer/home">MrSoccer</a></h1>
        <ul class="nav">
            <li><a href="/MrSoccer/addManager">Add Manager</a></li>
            <li><a href="/MrSoccer/standings">Standings</a></li>
            <li><a href="/MrSoccer/players">Players</a></li>
            <li><a href="/MrSoccer/clubs.jsp">Clubs</a></li>
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
                    <h5>Solskjaer: Did you expect anything else from Ronaldo?</h5>
                    <p>
                        Solskjaer press conference highlights Cavani and Ronaldo latest ahead of Man Utd vs Young boys
                    </p>

                    <img src="https://i2-prod.manchestereveningnews.co.uk/sport/football/football-news/article21557849.ece/ALTERNATES/s1200/3_GettyImages-1229190343jp.jpg"
                         alt="Solskjaer"/>
                </div>
            </div>

            <div class="card">
                <div class="card-header">
                    Transfers
                </div>
                <div class="card-body">
                    <h5>Mourinho: Roma boss celebrates 1001 game in charge</h5>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias dolores nobis voluptatibus.
                        Aliquid asperiores beatae earum perferendis quasi. Autem debitis dolores est molestias nam
                        provident quia repellendus sit. Expedita, modi.
                    </p>

                    <img src="https://phantom-marca.unidadeditorial.es/0bd2a8f827edc1f2736d1887721038bd/crop/0x97/2047x1248/resize/1320/f/jpg/assets/multimedia/imagenes/2021/09/13/16315630660725.jpg"
                         alt="Mourinho"/>
                </div>
            </div>

        </div>
        <div class="col-md-7">
            <div class="card-body">
                <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search manager.."
                       title="Type in a name">
                <%--<table id="myTable" class="table table-dark table-hover">
                  <thead>
                  <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Club</th>
                    <th scope="col">Nationality</th>

                  </tr>
                  </thead>

                  <tbody>
                  <c:forEach items="${managers}" var="managers">
                    <tr>
                      <td>${managers.name}</td>
                      <td>${managers.club}</td>
                      <td>${managers.nationality}</td>
                    </tr>
                  </c:forEach>

                  </tbody>
                </table>--%>
                <div id="componentRender">

                </div>
            </div>
        </div>
    </div>
</div>

<script>

    <jsp:include page="js/cohort9.lib.js"/>
    <jsp:include page="js/managers-list.js"/>

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
<jsp:include page="footer.jsp"/>

</body>

</html>