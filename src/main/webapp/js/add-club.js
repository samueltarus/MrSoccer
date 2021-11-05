appComponents.htmlForm.render(
    {
        url: "./addClub",
        method: "POST",
        formTitle: 'Add Club',
        renderId: "addClubForm",
        items:
            [{
                label: "Club Name",
                name: "club_name",
                id: "item.name",
                type: "text",
                required: true
            }, {
                label: "Manager Name",
                name: "manager_name",
                id: "item.club",
                type: "text",
                required: true
            }, {
                label: "Location",
                name: "location",
                id: "item.location",
                type: "text",
                required: true
            },
                {
                    label: "League",
                    name: "league",
                    id: "item.league",
                    type: "text",
                    required: true
                }
            ],
        submitButton: {
            type: 'submit',
            value: 'Save'
        }
    });