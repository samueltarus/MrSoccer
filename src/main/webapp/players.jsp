<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>MrSoccer</title>

    <jsp:include page="style.jsp" />
</head>

<body id="home">
<nav class="navbar">
    <div class="container">
        <h1 class="logo"><a href="/MrSoccer/home">MrSoccer</a></h1>
        <ul class="nav">
            <li><a href="/MrSoccer/addPlayer">Add Player</a></li>
            <li><a href="/MrSoccer/standings">Standings</a></li>
            <li><a href="/MrSoccer/clubs.jsp">Clubs</a></li>
            <li><a href="/MrSoccer/managers.jsp">Managers</a></li>
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
                <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search player.."
                       title="Type in a name">
                <table id="myTable" class="table table-dark table-hover">
                    <thead>
                    <tr>
                        <th scope="col">Player Id</th>
                        <th scope="col">Player Name</th>
                        <th scope="col">Player Position</th>
                        <th scope="col">Player Country</th>

                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach items="${players}" var="players">
                        <tr>
                            <td>${players.id}</td>
                            <td>${players.name}</td>
                            <td>${players.country}</td>
                            <td>${players.position}</td>
                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
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
            td = tr[i].getElementsByTagName("td")[1];
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
<jsp:include page="js/cohort9.lib.js"/>
<jsp:include page="js/managers-list.js"/>

<jsp:include page="footer.jsp" />

</body>

</html>