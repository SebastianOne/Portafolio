window.addEventListener("load",function()
{
    /*-------------------------aca realice la llamada a las tareas y el renderizado---------------------*/
    gets();
    /*-------------------------------------aca realice la agregacion de las tareas del usuario------------------*/
    /*
    form.addEventListener("submit",function(event){
        event.preventDefault();
        posts();
    })
    */

})

/*---------------------------------------aca realice las funciones que renderizan------------------*/

function renderizarPacientes(pacientes) {
    let pacientesFilas = document.querySelector(".contenido");
    pacientesFilas.innerHTML = ""

    for(let paciente of pacientes){
            renderizar(paciente,pacientesFilas);
    }
}

function renderizar(paciente,contenedor){

    let pacientesFilas = contenedor;
    let padre = document.createElement("tr");
    let hijos1 = document.createElement("td");
    let hijos2 = document.createElement("td");
    let hijos3 = document.createElement("td");
    let hijos4 = document.createElement("td");
    let hijos5 = document.createElement("td");
    let hijos6 = document.createElement("td");
    let hijos7 = document.createElement("td");
    let hijos8 = document.createElement("td");
    let hijos9 = document.createElement("td");
    let hijos10 = document.createElement("td");
    let hijos11 = document.createElement("td");
    let subHijos1 = document.createTextNode(paciente.email);
    let subHijos2 = document.createTextNode(paciente.nombre);
    let subHijos3 = document.createTextNode(paciente.apellido);
    let subHijos4 = document.createTextNode(paciente.dni);
    let subHijos5 = document.createTextNode(paciente.fecha_alta);
    let subHijos6 = document.createTextNode(paciente.domicilio.calle);
    let subHijos7 = document.createTextNode(paciente.domicilio.numero);
    let subHijos8 = document.createTextNode(paciente.domicilio.localidad);
    let subHijos9 = document.createTextNode(paciente.domicilio.provincia);
    let subHijos10 = document.createElement("button");
    let subHijos11 = document.createElement("button");

    subHijos10.classList.add("button");
    subHijos11.classList.add("button");

    subHijos10.onclick = function(event){
            // aca se realizara el eliminar
        console.log( event.target)
            const id = event.path[1].getAttribute("id");
            //puts(id, event);
        }

    padre.appendChild(hijos1.appendChild(subHijos1));
    padre.appendChild(hijos2.appendChild(subHijos2));
    padre.appendChild(hijos3.appendChild(subHijos3));
    padre.appendChild(hijos4.appendChild(subHijos4));
    padre.appendChild(hijos5.appendChild(subHijos5));
    padre.appendChild(hijos6.appendChild(subHijos6));
    padre.appendChild(hijos7.appendChild(subHijos7));
    padre.appendChild(hijos8.appendChild(subHijos8));
    padre.appendChild(hijos9.appendChild(subHijos9));
    padre.appendChild(hijos10.appendChild(subHijos10));
    padre.appendChild(hijos11.appendChild(subHijos11));
    contenedor.appendChild(padre);
}


/*----------------------------------------------------aca se hacen las peticiones a ----------------  */

function gets(){
    const optionsGet = {
        method: 'GET',
        headers: {
            'authorization': 'Bearer '+ JSON.parse(localStorage.getItem("jwt")).jwt,
            //'Access-Control-Allow-Credentials': true,
            //'Access-Control-Allow-Origin': '*'
        }
    };

    const urluserTasks = "http://localhost:8080/pacientes/";


    fetch(urluserTasks,optionsGet).then(response=>{
        console.log(response.status)
        response.json()}).then(json=>{
        //renderizarPacientes(json)
    }).catch();

}



function posts(){

    const nuevaTarea = document.querySelector("#newTask").value;

    const payload = {
        description: nuevaTarea,
        completed: false
    };
    const optionsPost = {
        method: 'POST',
        body:JSON.stringify(payload),
        headers: {
            'authorization': JSON.parse(localStorage.getItem("login")).jwt,
            "Content-type":'application/json'
        }
    };

    const urluserTasks = "https://ctd-todo-api.herokuapp.com/v1/tasks";

    fetch(urluserTasks,optionsPost).then(response=>{
        gets();
    }).catch();
}

function deletes(id, evento){
    const optionDelete = {
        method: 'DELETE',
        headers: {
            authorization: JSON.parse(localStorage.getItem("login")).jwt,
        }

    }

    let urluserTasks = `https://ctd-todo-api.herokuapp.com/v1/tasks/${id}`;

    fetch(urluserTasks,optionDelete).then(response=>{
        response
        evento.path[2].removeChild(evento.path[1]);
        gets()

    });


}

function puts(id,evento){

    const payload = {
        completed: true
    }

    const optionPut = {
        method: 'PUT',
        body: JSON.stringify(payload),
        headers: {
            authorization: JSON.parse(localStorage.getItem("login")).jwt,
            "Content-type":'application/json'
        }

    }

    let urluserTasks = `https://ctd-todo-api.herokuapp.com/v1/tasks/${id}`

    fetch(urluserTasks,optionPut).then(response=>{
        response
        evento.path[2].removeChild(evento.path[1]);
        gets()
    });

}