<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <jsp:include page="modal-login-style.jsp"/>
</head>

<body>

<div id="loginForm" class="container"></div>
<h2>Login Form</h2>

<form action="./login" method="post">
    <div class="imgcontainer">
        <img src="login.jpg" alt=""/>
    </div>

    <div class="container">
        <label for="username"> <b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="username" id="username" required>

        <label for="password"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" id="password" required>

        <button type="submit">Login</button>
    </div>
</form>

<script>
    let appComponents = {
        htmlForm : {
            formComponent: {},
            render: function (newFormComponent) {
                this.formComponent = newFormComponent
                let formToRender = `<h2>` + this.formComponent.formTitle + `</h2>`

            }
        }
    }
    //LOGIN FORM
    appComponents.htmlForm.render(
        {
            url: "./login",
            method: "POST",
            formTitle: "Login Form",
            renderId: "loginForm",
            items: [
                {
                    label: "Username",
                    name: "username",
                    id: "username",
                    type: "text"
                },
                {
                    label: "Password",
                    name: "password",
                    id: "password",
                    type: "password"
                },
            ],
            submitButton: {
                type: 'submit',
                value: 'Login'
            }
        }
    )
</script>

</body>
</html>
