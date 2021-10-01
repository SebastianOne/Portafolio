window.addEventListener("load",function()
{
    /*-------------------------aca se renderiza  a los odontologos ---------------------*/
    gets();

    /*-----------------------------------------------------------------------------*/

/*---------------------------------------aca realice las funciones que renderizan------------------*/

function renderizarOdontologos(pacientes) {
    let odontologosFilas = document.querySelector(".contenido");
    odontologosFilas.innerHTML = "";
    for(let odontologo of odontologos){
        renderizar(odontologo,odontologosFilas);
    }
}

function renderizar(odontologo,contenedor){
    contenedor;
    let padre = document.createElement("tr");

    let celda = document.createElement("td");
    let texto = document.createTextNode(odontologo.email);
    celda.setAttribute("id","nombre");

    
    let celda2 = document.createElement("td");
    let texto2 = document.createTextNode(odontologo.nombre);
    celda2.setAttribute("id","apellido");

    let celda3 = document.createElement("td");
    let texto3 = document.createTextNode(odontologo.apellido);
    celda3.setAttribute("id","matricula");

    let celda4 = document.createElement("td");
    let texto4 = document.createTextNode(odontologo.dni);
    celda4.setAttribute("id","email");


    let celda5 = document.createElement("td");
    let boton1 = document.createElement("button");
    let texto5 = document.createTextNode("eliminar");
    boton1.classList.add("botones");

    let celda6 = document.createElement("td");
    let boton2 = document.createElement("button");
    let texto6 = document.createTextNode("editar");
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


    //eliminar
    boton1.onclick = function(event){
        const id = event.path[2].querySelector("#id_odontologo").innerHTML;
        deletes(id,event);     
        }

    //boton editar
    boton2.onclick = function(event){
        const odontologo = {
            id_odontologo: event.path[2].querySelector("#id_odontologo").innerHTML,
            nombre: event.path[2].querySelector("#nombre").innerHTML,
            apellido: event.path[2].querySelector("#apellido").innerHTML,
            matricula: event.path[2].querySelector("#matricula").innerHTML,
            email: event.path[2].querySelector("#email").innerHTML,
            
        }
        
        localStorage.setItem("odontologo",JSON.stringify(odontologo));
        location.replace("http://127.0.0.1:5500/vistaProyectoFinal/actualizarOdontologo.html");  
    }

    boton1.appendChild(texto5)
    celda5.appendChild(boton1)
    padre.appendChild(celda5)
    

    boton2.appendChild(texto6)
    celda6.appendChild(boton2)
    padre.appendChild(celda6)
    
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

        const urluserTasks = "http://localhost:8080/odontologos/";
        fetch(urluserTasks,optionsGet).then(response=>response.json()).then(json=>renderizarOdontologos(json))

    }


    function deletes(id, datos){
        const optionDelete = {
            method: 'DELETE',
            headers: {
                'authorization': 'Bearer '+ JSON.parse(localStorage.getItem("jwt")).jwt
            }

    }

    let urluserTasks = `http://localhost:8080/odontologos/${id}`;

    fetch(urluserTasks,optionDelete).then(response=>{
        gets();
    }).catch();
    }
})
