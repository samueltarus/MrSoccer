<html>
<head>
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

<div id="addManagerForm" class="container"></div>
<script>

    <jsp:include page="js/lib.kevin.js"/>
    <jsp:include page="js/add-manager.js"/>

</script>
</body>
</html>