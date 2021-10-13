let appComponents = {
    htmlForm : {
        formComponent: {},
        render: function (newFormComponent) {
            this.formComponent = newFormComponent
            let formToRender = `<h2>` + this.formComponent.formTitle + `</h2>`

            formToRender += '<form action="' + this.formComponent.url + '" method="' + this.formComponent.method + '">';

            this.formComponent.items.forEach(item => {
                formToRender += '<label for="' + item.id + '">' + item.label + ':</label><br>'
                    + '<input type="' + item.type + '" id="' + item.id + '" name="' + item.name + '"><br>';
            });

            formToRender += '<input type="' + this.formComponent.submitButton.type + '" value="' + this.formComponent.submitButton.value + '"></form>';

            // console.log(formToRender);
            document.getElementById(this.formComponent.renderId).innerHTML = formToRender;

        }
    }

}