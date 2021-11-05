appComponents.htmlTable.render.call({
    url: "./clubs",
    method: "GET",
    tableTitle: 'Clubs',
    renderTo: 'componentRender',

    columns: [
        {
            header: "Id",
            dataIndex: 'id',
            width: 15,
        },
        {
            header: "Club Name",
            dataIndex: "club_name",
            width: 20
        }, {
            header: "Manager Name",
            dataIndex: "manager_name",
            width: 20
        }, {
            header: "Location",
            dataIndex: "location",
            width: 20
        }]
});