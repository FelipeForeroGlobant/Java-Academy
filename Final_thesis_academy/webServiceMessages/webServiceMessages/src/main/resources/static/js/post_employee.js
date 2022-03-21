window.addEventListener('load', function () {

    const formulario = document.querySelector('#add_new_paciente');
    formulario.addEventListener('submit', function (event) {
        event.preventDefault();
        const formData = {
            name: document.querySelector('#name').value,
            lastName: document.querySelector('#lastName').value,
            dni: document.querySelector('#dni').value,
            address: document.querySelector('#address').value,
            zipCodeCity: document.querySelector('#zipCodeCity').value,
            state: document.querySelector('#state').value,
            country: document.querySelector('#country').value,
            userName: document.querySelector('#userName').value,
        };

        const url = '/employees';
        const settings = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }

        fetch(url, settings)
            .then(response => response.json())
            .then(data => {
                 let successAlert = '<div class="alert alert-success alert-dismissible">' +
                     '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                     '<strong></strong> employee saved </div>'

                 document.querySelector('#response').innerHTML = successAlert;
                 document.querySelector('#response').style.display = "block";
                 resetUploadForm();

            })
            .catch(error => {
                    let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
                                     '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                                     '<strong> Error try again</strong> </div>'

                      document.querySelector('#response').innerHTML = errorAlert;
                      document.querySelector('#response').style.display = "block";
                     resetUploadForm();})
    });

    function resetUploadForm(){
        document.querySelector('#name').value = "";
        document.querySelector('#lastName').value = "";
        document.querySelector('#dni').value = "";
        document.querySelector('#address').value = "";
        document.querySelector('#zipCodeCity').value = "";
        document.querySelector('#state').value = "";
        document.querySelector('#country').value = "";
        document.querySelector('#userName').value = "";
    }

    (function(){
        let pathname = window.location.pathname;
        if(pathname === "/"){
            document.querySelector(".nav .nav-item a:first").addClass("active");
        } else if (pathname == "/employeesList.html") {
            document.querySelector(".nav .nav-item a:last").addClass("active");
        }
    })();
});