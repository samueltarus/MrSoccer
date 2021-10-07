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

    <title>Login</title>

    <style>
        form {
            /*margin-top: 5%;*/
            text-align: center;
            position: relative;
            z-index: 1;
            background: #FFFFFF;
            max-width: 360px;
            margin: 0 auto 100px;
            padding: 45px;

        }

        body {
            margin: 50px 0px;
            padding: 0px;
            text-align: center;
            align: center;
        }

        label, input {
            display: block;
            width: 150px;
            float: left;
            margin-bottom: 10px;
        }

        label {
            text-align: right;
            width: 75px;
            padding-right: 20px;
        }

        br {
            clear: left;
        }

    </style>
</head>
<body>

<div id="loginForm" class="container"></div>

<script>
    var appComponents = {
        htmlForm: {
            formCmp: {},
            render: function (newFormCmp) {
                this.formCmp = newFormCmp;

                var formToRender = '<h2>' + this.formCmp.formTitle + '</h2>';

                formToRender += '<form action="' + this.formCmp.url + '" method="' + this.formCmp.method + '">';

                this.formCmp.items.forEach(item => {
                    formToRender += '<label for="' + item.id + '">' + item.label + ':</label><br>'
                        + '<input type="' + item.type + '" id="' + item.id + '" name="' + item.name + '"><br>';
                });

                formToRender += '<input type="' + this.formCmp.submitBtn.type + '" value="' + this.formCmp.submitBtn.value + '"></form>';

                console.log(formToRender);
                document.getElementById(this.formCmp.renderId).innerHTML = formToRender;

            }
        }
    };

    // Login form
    appComponents.htmlForm.render({
        url: "./login",
        method: "POST",
        formTitle: 'Login',
        renderId: "loginForm",
        items: [{
            label: "Username",
            name: "username",
            id: "username",
            type: "text"
        }, {
            label: "Password",
            name: "password",
            id: "password",
            type: "password"
        }],
        submitBtn: {
            type: 'submit',
            value: 'Login'
        }
    });

</script>

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

<!-- body {
margin:50px 0px; padding:0px;
text-align:center;
align:center;
}
label,input {
display: block;
width: 150px;
float: left;
margin-bottom: 10px;
}

label {
text-align: right;
width: 75px;
padding-right: 20px;
}

br {
clear: left;
}
-->