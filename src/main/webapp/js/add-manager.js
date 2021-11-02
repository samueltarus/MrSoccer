appComponents.htmlForm.render(
    {
        url: "./addManager",
        method: "POST",
        formTitle: 'Add Manager',
        renderId: "addManagerForm",
        items:
            [{
                label: "Name",
                name: "name",
                id: "item.name",
                type: "text",
                required: true
            }, {
                label: "Club",
                name: "club",
                id: "item.club",
                type: "text",
                required: true
            }, {
                label: "Nationality",
                name: "nationality",
                id: "item.nationality",
                type: "text",
                required: true
            }
            ],
        submitButton: {
            type: 'submit',
            value: 'Save'
        }
    });