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
            header: "Coach",
            dataIndex: "coach",
            width: 20
        }, {
            header: "League",
            dataIndex: "league",
            width: 20
        }, {
            header: "Name",
            dataIndex: "name",
            width: 20
        }]
});