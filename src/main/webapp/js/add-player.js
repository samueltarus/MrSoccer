appComponents.htmlForm.render(
    {
        url: "./addPlayer",
        method: "POST",
        formTitle: 'Add Player',
        renderId: "addPlayerForm",
        items:
            [{
                label: "Player Name",
                name: "player_name",
                id: "item.name",
                type: "text",
                required: true
            }, {
                label: "Nationality",
                name: "nationality",
                id: "item.nationality",
                type: "text",
                required: true
            }, {
                label: "Position",
                name: "position",
                id: "item.position",
                type: "text",
                required: true
            }
            ],
        submitButton: {
            type: 'submit',
            value: 'Save'
        }
    });