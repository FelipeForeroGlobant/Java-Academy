window.addEventListener('load', function () {

(function(){
  event.preventDefault();
  const url = '/employees/list';
  const settings = {
    method: 'GET'
}
  fetch(url,settings)
  .then(response => response.json())
  .then(data => {
     for(paciente of data){

       let deleteButton = '<button' +
                                  ' id=' + '\"' + 'btn_delete_' + paciente.id + '\"' +
                                  ' type="button" onclick="deleteBy('+paciente.id+')" class="btn btn-danger btn_delete">' +
                                  '&times' +
                                  '</button>';

      let get_More_Info_Btn = '<button' +
                                  ' id=' + '\"' + 'btn_id_' + paciente.id + '\"' +
                                  ' type="button" onclick="findBy('+paciente.id+')" class="btn btn-info btn_id">' +
                                  paciente.id +
                                  '</button>';

      let tr_id = 'tr_' + paciente.id;
      let pacienteRow = '<tr id=\"' + tr_id + "\"" + '>' +
                '<td>' + get_More_Info_Btn + '</td>' +
                '<td class=\"td_name\">' + paciente.name.toUpperCase()  + '</td>' +
                '<td class=\"td_lastName\">' + paciente.lastName.toUpperCase()  + '</td>' +
                '<td class=\"td_dni\">' + paciente.dni + '</td>'+
                '<td class=\"td_address\">' + paciente.address.toUpperCase()  + '</td>' +
                '<td class=\"td_zipCodeCity\">' + paciente.zipCodeCity + '</td>' +
                '<td class=\"td_state\">' + paciente.state.toUpperCase()  + '</td>' +
                '<td class=\"td_country\">' + paciente.country.toUpperCase()  + '</td>' +
                '<td class=\"td_country\">' + paciente.userName.toUpperCase()  + '</td>' +

                '<td>' + deleteButton + '</td>' +
                '</tr>';
      $('#pacienteTable tbody').append(pacienteRow);
    };

})
})

(function(){
  let pathname = window.location.pathname;
  if (pathname == "/employeesList.html") {
      document.querySelector(".nav .nav-item a:last").addClass("active");
  }
})


})