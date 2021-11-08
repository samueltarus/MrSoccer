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
                label: "League",
                name: "league",
                id: "item.league",
                type: "text",
                required: true
            },
                {
                    label: "Stadium",
                    name: "stadium",
                    id: "item.stadium",
                    type: "text",
                    required: true
                },
                {
                    label: "Total Games Played",
                    name: "totalGamesPlayed",
                    id: "item.totalGamesPlayed",
                    type: "int",
                    required: true
                },
                {
                    label: "Games Won",
                    name: "gamesWon",
                    id: "item.gamesWon",
                    type: "int",
                    required: true
                },
                {
                    label: "Games Lost",
                    name: "gamesLost",
                    id: "item.gamesLost",
                    type: "int",
                    required: true
                },
                {
                    label: "Games Drawn",
                    name: "gamesDrawn",
                    id: "item.gamesDrawn",
                    type: "int",
                    required: true
                }

            ],
        submitButton: {
            type: 'submit',
            value: 'Save'
        }
    });