fetch("data.json")
.then((data)=>{
return data.json();
})
.then((objectdata)=>{
   console.log(objectdata[0].first_name);
   let tableData = "";
   objectdata.map((values)=>{
    tableData += `
    <tr>
    <td>${values.first_name}</td>
    <td>${values.last_name}</td>
    <td>${values.department}</td>
    </tr>
    `
   });
   document.getElementById("table_body")
   .innerHTML =tableData;
})

