AppComponents.htmlTable.render.call({
    url: "./players",
    method: "GET",
    tableTitle: 'Players',
    renderTo: 'componentRender',
    columns: [
        {
            header: "Id",
            dataIndex: 'player_id',
            width: 15,
        },
        {
            header: "Name",
            dataIndex: "player_name",
            width: 20
        }, {
            header: "Position",
            dataIndex: "position",
            width: 20
        }, {
            header: "Nationality",
            dataIndex: "nationality",
            width: 20
        }],
    buttons: [
        {
            label: "Delete",
            type: "submit",
            id: 'manager.delete',
            url: ".deletePlayer",
            handler: function () {

                let checkedarray = [];

                var checked = document.querySelectorAll('input:checked');

                if (checked.length === 0) {
                    // there are no checked checkboxes
                    console.log('no checkboxes checked');
                } else {
                    // there are some checked checkboxes so we can do a delete
                    console.log(checked.length + ' checkboxes checked');
                    checkedarray.push(checked[i].value)
                }
            }
        }
    ]
});