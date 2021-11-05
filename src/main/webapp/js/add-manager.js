appComponents.htmlForm.render(
    {
        url: "./addManager",
        method: "POST",
        formTitle: 'Add Manager',
        renderId: "addManagerForm",
        items:
            [{
                label: "Manager Name",
                name: "manager_name",
                id: "item.name",
                type: "text",
                required: true
            }, {
                label: "Club Name",
                name: "club_name",
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