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

            <li><a href="/MrSoccer/addTeam">Add Club</a></li>
            <li><a href="/MrSoccer/standings">Standings</a></li>
            <li><a href="/MrSoccer/players">Players</a></li>
            <li><a href="/MrSoccer/managers">Managers</a></li>
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
                    <h5>Shearer: Did you expect anything else from Ronaldo?</h5>
                    <p>
                        Alan Shearer says Cristiano Ronaldo's goalscoring return to Manchester United
                        was nothing more than he and many others expected...
                    </p>

                    <img src="https://www.p1travel.com/wp-content/uploads/2021/06/2021-2022-5-scaled.jpg"
                         alt="Chelsea"/>
                </div>
            </div>

            <div class="card">
                <div class="card-header">
                    Transfers
                </div>
                <div class="card-body">
                    <h5>Hazard: Did you expect Eden Hazard back to Chelsea?</h5>
                    <p>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias dolores nobis voluptatibus.
                        Aliquid asperiores beatae earum perferendis quasi. Autem debitis dolores est molestias nam
                        provident quia repellendus sit. Expedita, modi.
                    </p>

                    <img src="https://imgresizer.eurosport.com/unsafe/1200x0/filters:format(jpeg):focal(1544x286:1546x284)/origin-imgresizer.eurosport.com/2019/04/08/2561563-53129970-2560-1440.jpg"
                         alt="Chelsea"/>
                </div>
            </div>

        </div>
        <div class="col-md-7">
            <div class="card-body">
                <input type="text" id="myInput" onkeyup="searchFunction()" placeholder="Search club.."
                       title="Type in a name">
                <table id="myTable" class="table table-dark table-hover">
                    <thead>
                    <tr>
                        <th scope="col">Coach</th>
                        <th scope="col">League</th>
                        <th scope="col">Name</th>

                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach items="${clubs}" var="club">
                        <tr>
                            <td>${club.coach}</td>
                            <td>${club.league}</td>
                            <td>${club.name}</td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<script>
    function searchFunction() {
        var input, filter, table, tr, td, i, txtValue;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) {
            td = tr[i].getElementsByTagName("td")[2];
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

<!-- Footer -->
<footer class="section-footer">
    <div class="container">
        <div>
            <h2>Follow us on Social Media</h2>
            <a href="http://twitter.com/mullatoez">
                <i class="fab fa-twitter fa-2x"></i>
            </a>
            <a href="http://instagram.com/mullatoez">
                <i class="fab fa-instagram fa-2x"></i>
            </a>
            <a href="https://www.youtube.com/channel/UCqzNRcE2KEsBHLaVdinakZg">
                <i class="fab fa-youtube fa-2x"></i>
            </a>
            <a href="http://github.com/mullatoez">
                <i class="fab fa-github fa-2x"></i>
            </a>
        </div>

        <div>
            <ul>
                <li><a href="/MrSoccer/clubs">Clubs</a></li>
                <li><a href="/MrSoccer/players">Players</a></li>
                <li><a href="/MrSoccer/managers">Managers</a></li>
                <li><a href="/MrSoccer/home">Terms of Service</a></li>
            </ul>
        </div>
        <div>
            <h3>Top News</h3>

            <ul>
                <li><a href="#">Lukaku's new 'home'</a></li>
                <li><a href="#">CR7 Magic</a></li>
                <li><a href="#">Ponderous Arsenal</a></li>
                <li><a href="#">Daniel Farke's fault?</a></li>
            </ul>
        </div>
        <div>
            <h3>Subscribe</h3>
            <p>Wanna get intouch with the developer?Just use your e-mail below</p>
            <form name="email-form" method="POST" data-netlify="true">
                <div class="email-form">
                        <span class="form-control-wrap">
                            <input type="email" name="email" id="email" size="40" class="form-control"
                                   placeholder="Email">
                        </span>
                    <button type="submit" class="form-control submit">
                        <i class="fas fa-chevron-right"></i>

                    </button>
                </div>
            </form>
        </div>

    </div>
</footer>

</body>

</html>