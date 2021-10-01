window.addEventListener("load",function()
{
    const form = document.querySelector("form");

    
    /*-------------------------------------aca realice la agregacion de los pacientes------------------*/
    form.addEventListener("submit",function(event){
        event.preventDefault();
        posts();
    })


    function posts(){

        const nombres = document.querySelector("#nombre").value;
        const apellidos = document.querySelector("#apellido").value;
        const dni = document.querySelector("#dni").value;
        const fecha_alta = document.querySelector("#fecha_alta").value;
        const calle_residencia = document.querySelector("#calle").value;
        const numero_residencia = document.querySelector("#numero").value;
        const localidad = document.querySelector("#localidad").value;
        const provincia = document.querySelector("#provincia").value;
        const email = document.querySelector("#email").value;
        const password = document.querySelector("#password").value;
    
        const payload = {
            nombre: nombres,
            apellido: apellidos,
            dni: dni,
            fecha_alta: fecha_alta,
            email: email,
            password: password,
            domicilio: {
                calle: calle_residencia,
                numero: numero_residencia,
                localidad: localidad,
                provincia: provincia
            }
            
        };
        
        const optionsPost = {
            method: 'POST',
            body:JSON.stringify(payload),
            headers: {
                'authorization': 'Bearer '+ JSON.parse(localStorage.getItem("jwt")).jwt,
                "Content-type":'application/json'
            }
        };
    
        const urluserTasks = "http://localhost:8080/pacientes/";
    
        fetch(urluserTasks,optionsPost).then(response=>{
            console.log(response.status)
                location.replace("http://127.0.0.1:5500/vistaProyectoFinal/paciente.html"); 
            
            
        }).catch(err=>console.log(error));

    }
})
