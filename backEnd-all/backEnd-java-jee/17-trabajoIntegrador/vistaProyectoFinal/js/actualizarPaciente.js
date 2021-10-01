window.addEventListener("load",function()
{
    const form = this.document.querySelector("form");
    const paciente = JSON.parse(this.localStorage.getItem("paciente"));
    insertarDatosForm(paciente);


    /*-------------------------------------aca realice la agregacion de los pacientes------------------*/
    form.addEventListener("submit",function(event){
        event.preventDefault();
        event.preventDefault();
        put(paciente);
    })

    /*
    metodos de put y el metodo que renderiza los datos que se deben modificar
    */
   
    function put(paciente){
   
        const payload = {
            id: paciente.id_paciente,
            nombre: document.querySelector("#nombre").value,
            apellido: document.querySelector("#apellido").value,
            dni: document.querySelector("#dni").value,
            fecha_alta: document.querySelector("#fecha_alta").value,
            email: document.querySelector("#email").value,
            password: document.querySelector("#password").value,
            domicilio: {
                id:paciente.id_domicilio,
                calle: document.querySelector("#calle").value,
                numero: document.querySelector("#numero").value,
                localidad: document.querySelector("#localidad").value,
                provincia: document.querySelector("#provincia").value
            }
            
        };
        
        const optionsPost = {
            method: 'PUT',
            body:JSON.stringify(payload),
            headers: {
                'authorization': 'Bearer '+ JSON.parse(localStorage.getItem("jwt")).jwt,
                "Content-type":'application/json'
            }
        };
    
        const urluserTasks = "http://localhost:8080/pacientes/";
    
        fetch(urluserTasks,optionsPost).then(response=>{
            if(response.status === 200){
                alert("Paciente actualizado con exito");
                location.replace("http://127.0.0.1:5500/vistaProyectoFinal/paciente.html");
            }           
        }).catch(err=>console.log(error));
    }


    function insertarDatosForm(paciente,contenedor){
        document.querySelector("#nombre").setAttribute('value',paciente.nombre);
        document.querySelector("#apellido").setAttribute('value',paciente.apellido);
        document.querySelector("#dni").setAttribute('value',paciente.dni);
        document.querySelector("#fecha_alta").setAttribute('value',paciente.fecha_alta);
        document.querySelector("#calle").setAttribute('value',paciente.calle);
        document.querySelector("#numero").setAttribute('value',paciente.numero); 
        document.querySelector("#localidad").setAttribute('value',paciente.localidad);
        document.querySelector("#provincia").setAttribute('value',paciente.provincia);
        document.querySelector("#email").setAttribute('value',paciente.email); 
    }

});

