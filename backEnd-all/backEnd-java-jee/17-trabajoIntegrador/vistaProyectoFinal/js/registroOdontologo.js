window.addEventListener("load",function()
{
    const form = document.querySelector("form");

    /*-------------------------------------aca realice la agregacion de los odontologos------------------*/
    form.addEventListener("submit",function(event){
        event.preventDefault();
        posts();
    })


    function posts(){

        const nombres = document.querySelector("#nombre").value;
        const apellidos = document.querySelector("#apellido").value;
        const matricula = document.querySelector("#matricula").value;
        const email = document.querySelector("#email").value;
        const password = document.querySelector("#password").value;
    
        const payload = {
            nombre: nombres,
            apellido: apellidos,
            matricula: matricula,
            email: email,
            password: password            
        };
        
        const optionsPost = {
            method: 'POST',
            body:JSON.stringify(payload),
            headers: {
                'authorization': 'Bearer '+ JSON.parse(localStorage.getItem("jwt")).jwt,
                "Content-type":'application/json'
            }
        };
    
        const urluserTasks = "http://localhost:8080/odontologos/";
    
        fetch(urluserTasks,optionsPost).then(response=>{
            console.log(response.status)
                location.replace("http://127.0.0.1:5500/vistaProyectoFinal/odontologo.html"); 
            
            
        }).catch(err=>console.log(error));

    }
})
