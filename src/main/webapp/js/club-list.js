appComponents.htmlTable.render.call({
    url: "./clubs",
    method: "GET",
    tableTitle: 'Clubs',
    renderTo: 'componentRender',
    columns: [{
        header: "Coach",
        dataIndex: "coach",
        width: 35
    }, {
        header: "League",
        dataIndex: "league",
        width: 35
    }, {
        header: "Name",
        dataIndex: "name",
        width: 35
    }],
    buttons: []
});