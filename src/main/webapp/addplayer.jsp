<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <title>Title</title>
  <style>
    form {
      /*margin-top: 5%;*/
      text-align: center;
      position: relative;
      z-index: 1;
      background: #FFFFFF;
      max-width: 420px;
      margin: 0 auto 100px;
      padding: 25px;

    }

    body {
      margin: 50px 0px;
      padding: 0px;
      text-align: center;
      align: center;
    }

    label, input {
      display: block;
      width: 300px;
      float: left;
      margin-bottom: 10px;
    }

    label {
      text-align: right;
      width: 150px;
      padding-right: 20px;
    }

    br {
      clear: left;
    }

  </style>
</head>
<body>

<div id="addPlayerForm" class="container"></div>

</div>

<script>
  <jsp:include page="js/lib.kevin.js"/>
  <jsp:include page="js/add-player.js"/>
</script>

</body>
</html>