appComponents.htmlForm.render(
    {
        url: "./login",
        method: "POST",
        formTitle: 'Login',
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
            }
        ],
        submitButton: {
            type: 'submit',
            value: 'Login'
        }
    });

