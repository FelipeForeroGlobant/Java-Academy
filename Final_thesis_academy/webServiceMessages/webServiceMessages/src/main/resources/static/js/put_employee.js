window.addEventListener('load', function () {
    const formulario = document.querySelector('#update_paciente_form');
    formulario.addEventListener('submit', function (event) {
        let pacientetId = document.querySelector('#paciente_id').value;
        const formData = {
            id: document.querySelector('#paciente_id').value,
            name: document.querySelector('#nameInfo').value,
            lastName: document.querySelector('#lastNameInfo').value,
            dni: document.querySelector('#dniInfo').value,
            address: document.querySelector('#addressInfo').value,
            zipCodeCity: document.querySelector('#zipCodeCityInfo').value,
            state: document.querySelector('#stateInfo').value,
            country: document.querySelector('#countryInfo').value,
            userName: document.querySelector('#userNameInfo').value,


        };
        const url = '/employees';
        const settings = {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }
          fetch(url,settings)
          .then(response => response.json())

    })
 })

    function findBy(id) {
          const url = '/employees'+"/"+id;
          const settings = {
              method: 'GET'
          }
          fetch(url,settings)
          .then(response => response.json())
          .then(data => {
              let paciente = data;

              document.querySelector('#paciente_id').value = paciente.id;
              document.querySelector('#nameInfo').value = paciente.name;
              document.querySelector('#lastNameInfo').value = paciente.lastName;
              document.querySelector('#dniInfo').value = paciente.dni;
              document.querySelector('#addressInfo').value = paciente.address;
              document.querySelector('#zipCodeCityInfo').value = paciente.zipCodeCity;
              document.querySelector('#stateInfo').value = paciente.state;
              document.querySelector('#countryInfo').value = paciente.country;
              document.querySelector('#userNameInfo').value = paciente.userName;


              document.querySelector('#div_paciente_updating').style.display = "block";
          }).catch(error => {
              alert("Error: " + error);
          })
      }