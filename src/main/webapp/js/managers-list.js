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
            dataIndex: "manager_name",
            width: 20
        }, {
            header: "Club",
            dataIndex: "club_name",
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
            url: ".deleteManager",
            handler: function () {

                let checkedarray = [];

                var checked = document.querySelectorAll('input:checked');

                if (checked.length === 0) {
                    // there are no checked checkboxes
                    console.log('no checkboxes checked');
                } else {
                    // there are some checked checkboxes so we can do a delete
                    // console.log(checked.length + ' checkboxes checked');
                    checkedarray.push(checked[i].value)

                    var answer = confirm('Are you sure you want to delete this checkbox?');
                    if (answer) {
                        $("#checkboxid").remove();
                    } else {
                        alert("Pls check the checkbox.");
                    }

                }
            }
        }
    ]
});