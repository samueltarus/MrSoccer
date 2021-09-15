<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

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

<div class="row" style="background-image: url('background.jpg');">
  <form action="/MrSoccer/addPlayer" method="post">

    <h3>Add Club details</h3>
    <hr>

    <div class="mb-3">
      <label for="id" class="form-label">Id</label>
      <input type="number" class="form-control" id="id" name="id">
    </div>

    <div class="mb-3">
      <label for="name" class="form-label">Name</label>
      <input type="text" class="form-control" id="name" name="name">
    </div>

    <div class="mb-3">
      <label for="country" class="form-label">Nationality</label>
      <input type="text" class="form-control" id="country" name="country">
    </div>

    <div class="mb-3">
      <label for="position" class="form-label">Position</label>
      <input type="text" class="form-control" id="position" name="position">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
  </form>

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