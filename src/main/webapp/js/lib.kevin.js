


let appComponents = {

    htmlForm: {
        formComponent: {},
        render: function (newFormComponent) {
            this.formComponent = newFormComponent
            let formToRender = `<h2>` + this.formComponent.formTitle + `</h2>`

            formToRender += '<form action="' + this.formComponent.url + '" method="' + this.formComponent.method + '">';

            this.formComponent.items.forEach(item => {
                formToRender += '<label for="' + item.id + '">' + item.label + ':</label><br>'
                    + '<input type="' + item.type + '" id="' + item.id + '" name="' + item.name + '"><br>';
            });

            formToRender += '<input type="' + this.formComponent.submitButton.type + '" value="' + this.formComponent.submitButton.value + '"></form>';

            // console.log(formToRender);
            document.getElementById(this.formComponent.renderId).innerHTML = formToRender;

        }
    },

    htmlTable: {
        render: function () {
            /* this method render html page */

            let me = this;
            let tableToRender = '<h2>' + me.tableTitle + '</h2>';

            /*me.buttons.forEach(btn => {
                tableToRender += '<button type="button" id="' + btn.id + '">' + btn.label + '</button>';
            });*/

            tableToRender += '<br/><br/><table>';

            let tableColGroup = '<colgroup>';
            let tableHeaders = '<thead><tr>';

            tableColGroup += '<col span="1" style="width: 3%">';
            tableHeaders += '<th></th>';

            me.columns.forEach(col => {
                tableColGroup += '<col span="' + (col.span ? col.span : 1) + '" style="' + (col.width ? 'width:' + col.width + '%;' : '') + '">';
                tableHeaders += '<th>' + col.header + '</th>';

            });

            tableColGroup += '</colgroup>';
            tableHeaders += '</tr></thead>';

            tableToRender += tableColGroup + tableHeaders;

            tableToRender += '<tbody>';

            //load page from html
            var ajaxReq = new XMLHttpRequest();
            ajaxReq.onreadystatechange = function () {
                if (ajaxReq.readyState == XMLHttpRequest.DONE) {
                    if (ajaxReq.status == 200) {
                        let reqRes = eval('(' + ajaxReq.responseText + ')');
                        reqRes.list.forEach(row => {

                            tableToRender += '<tr><td><input type="checkbox" name="dataCheck" value="id" />&nbsp;</td>';

                            //tableToRender += '<tr><td><label for="dataCheck" > + row.id + </label&nbsp;</td>';

                            me.columns.forEach(col => {
                                tableToRender += '<td>' + row[col.dataIndex] + '&nbsp;</td>';

                                let firstRowId = row.id

                                console.log(firstRowId) // prints the first id

                            });

                            tableToRender += '</tr>';
                        });

                    }
                }
            }

            ajaxReq.open(me.method, me.url, false);
            ajaxReq.send();

            tableToRender += '</tbody>'
            document.getElementById(me.renderTo).innerHTML = tableToRender;

        }
    }

}

function ajaxRequestFun(ajaxReq, tableToRender, me) {
    ajaxReq.onreadystatechange = function () {
        if (ajaxReq.readyState == XMLHttpRequest.DONE) {
            if (ajaxReq.status == 200) {
                let reqRes = eval('(' + ajaxReq.responseText + ')');
                reqRes.list.forEach(row => {

                    tableToRender += '<tr><td><input type="checkbox" name="dataCheck" value="id" />&nbsp;</td>';

                    //tableToRender += '<tr><td><label for="dataCheck" > + row.id + </label&nbsp;</td>';

                    me.columns.forEach(col => {
                        tableToRender += '<td>' + row[col.dataIndex] + '&nbsp;</td>';

                        let allIdsAvailable = row.id

                        console.log(allIdsAvailable) // prints the all available ids

                    });

                    tableToRender += '</tr>';

                });

            }
        }
    }
    return tableToRender;
}