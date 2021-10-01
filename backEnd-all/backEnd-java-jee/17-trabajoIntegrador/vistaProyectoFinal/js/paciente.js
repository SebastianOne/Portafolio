window.addEventListener("load",function()
{
    /*-------------------------aca se renderiza  a los pacientes ---------------------*/
    gets();

    /*-----------------------------------------------------------------------------*/

/*---------------------------------------aca realice las funciones que renderizan------------------*/

function renderizarPacientes(pacientes) {
    let pacientesFilas = document.querySelector(".contenido");
    pacientesFilas.innerHTML = "";
    for(let paciente of pacientes){
        renderizar(paciente,pacientesFilas);
    }
}

function renderizar(paciente,contenedor){
    contenedor;
    let padre = document.createElement("tr");

    let celda = document.createElement("td");
    let texto = document.createTextNode(paciente.email);
    celda.setAttribute("id","email");

    
    let celda2 = document.createElement("td");
    let texto2 = document.createTextNode(paciente.nombre);
    celda2.setAttribute("id","nombre");

    let celda3 = document.createElement("td");
    let texto3 = document.createTextNode(paciente.apellido);
    celda3.setAttribute("id","apellido");

    let celda4 = document.createElement("td");
    let texto4 = document.createTextNode(paciente.dni);
    celda4.setAttribute("id","dni");

    let celda5 = document.createElement("td");
    let texto5 = document.createTextNode(paciente.fecha_alta);
    celda5.setAttribute("id","fecha_alta");

    let celda6 = document.createElement("td");
    let texto6 = document.createTextNode(paciente.domicilio.calle);
    celda6.setAttribute("id","calle");

    let celda7 = document.createElement("td");
    let texto7 = document.createTextNode(paciente.domicilio.numero);
    celda7.setAttribute("id","numero");
    
    let celda8 = document.createElement("td");
    let texto8 = document.createTextNode(paciente.domicilio.localidad);
    celda8.setAttribute("id","localidad");

    let celda9 = document.createElement("td");
    let texto9 = document.createTextNode(paciente.domicilio.provincia);
    celda9.setAttribute("id","provincia");

    
    let celda10 = document.createElement("td");
    let texto10 = document.createTextNode(paciente.id);
    celda10.setAttribute("id","id_paciente");


    let celda11 = document.createElement("td");
    let texto11 = document.createTextNode(paciente.domicilio.id);
    celda11.setAttribute("id","id_domicilio");


    let celda12 = document.createElement("td");
    let boton1 = document.createElement("button");
    let texto12 = document.createTextNode("eliminar");
    boton1.classList.add("botones");

    let celda13 = document.createElement("td");
    let boton2 = document.createElement("button");
    let texto13 = document.createTextNode("editar");
    boton2.classList.add("botones");

    celda.appendChild(texto);
    padre.appendChild(celda)

    celda2.appendChild(texto2)
    padre.appendChild(celda2)

    celda3.appendChild(texto3)
    padre.appendChild(celda3)

    celda4.appendChild(texto4)
    padre.appendChild(celda4)

    celda5.appendChild(texto5)
    padre.appendChild(celda5)

    celda6.appendChild(texto6)
    padre.appendChild(celda6)

    celda7.appendChild(texto7)
    padre.appendChild(celda7)

    celda8.appendChild(texto8)
    padre.appendChild(celda8)

    celda9.appendChild(texto9)
    padre.appendChild(celda9)

    celda10.appendChild(texto10)
    padre.appendChild(celda10)

    celda11.appendChild(texto11)
    padre.appendChild(celda11)

    //eliminar
    boton1.onclick = function(event){
        const id = event.path[2].querySelector("#id_paciente").innerHTML;
        deletes(id,event);     
        }

    //boton editar
    boton2.onclick = function(event){
        const paciente = {
            id_paciente: event.path[2].querySelector("#id_paciente").innerHTML,
            nombre: event.path[2].querySelector("#nombre").innerHTML,
            apellido: event.path[2].querySelector("#apellido").innerHTML,
            dni: event.path[2].querySelector("#dni").innerHTML,
            fecha_alta: event.path[2].querySelector("#fecha_alta").innerHTML,
            id_domicilio: event.path[2].querySelector("#id_domicilio").innerHTML,
            calle: event.path[2].querySelector("#calle").innerHTML,
            numero: event.path[2].querySelector("#numero").innerHTML,
            localidad: event.path[2].querySelector("#localidad").innerHTML,
            provincia: event.path[2].querySelector("#provincia").innerHTML,
            email: event.path[2].querySelector("#email").innerHTML,
        }
        

        localStorage.setItem("paciente",JSON.stringify(paciente));
        location.replace("http://127.0.0.1:5500/vistaProyectoFinal/actualizarPaciente.html");  
    }

    boton1.appendChild(texto12)
    celda12.appendChild(boton1)
    padre.appendChild(celda12)
    

    boton2.appendChild(texto13)
    celda13.appendChild(boton2)
    padre.appendChild(celda13)

    contenedor.appendChild(padre)



    }



    /*----------------------------------------------------aca se hacen las peticiones a ----------------  */

    function gets(){
        const optionsGet = {
            method: 'GET',
            headers: {
                'authorization': 'Bearer '+ JSON.parse(localStorage.getItem("jwt")).jwt
            }
    };

        const urluserTasks = "http://localhost:8080/pacientes/";
        fetch(urluserTasks,optionsGet).then(response=>response.json()).then(json=>renderizarPacientes(json))

    }


    function deletes(id, datos){
        const optionDelete = {
            method: 'DELETE',
            headers: {
                'authorization': 'Bearer '+ JSON.parse(localStorage.getItem("jwt")).jwt
            }

    }

    let urluserTasks = `http://localhost:8080/pacientes/${id}`;

    fetch(urluserTasks,optionDelete).then(response=>{
        gets();
    }).catch();
    }
})
