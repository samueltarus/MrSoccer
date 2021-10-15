AppComponents.htmlTable.render.call({
    url: "./managers",
    method: "GET",
    tableTitle: 'Managers',
    renderTo: 'componentRender',
    columns: [
        {
            header: "Id",
            dataIndex: 'id',
            width: 15,
        },
        {
            header: "Name",
            dataIndex: "name",
            width: 20
        }, {
            header: "Club",
            dataIndex: "club",
            width: 20
        }, {
            header: "Nationality",
            dataIndex: "nationality",
            width: 20
        }],
    buttons: [
        {
            label: 'Delete',
            value: 'delete',
            id: 'deleteManager',
            type: 'delete'
        }
    ]
});