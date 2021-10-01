
window.addEventListener("load",function(){

    const urlLoginAdmin = "http://localhost:8080/administradores/authenticate";
    const urlLoginOdontologo = "http://localhost:8080/odontologos/authenticate";
    const urlLoginPaciente = "http://localhost:8080/pacientes/authenticate";

    const form = document.querySelector("form");
    const usuarios = ["admin","odontologo", "paciente" ];
    let status = "";


    form.addEventListener("submit",function(event){
        event.preventDefault();
        const Usr = document.querySelector("#usuario").value;
        console.log(Usr)
        const UsrEmail = document.querySelector("#email").value;
        const UsrPassword = document.querySelector("#password").value;
        const payload = {
            username: UsrEmail,
            password: UsrPassword
        };
    
        const options = {
            method: 'POST',
            body:JSON.stringify(payload),
            headers: {
                "Content-Type":'application/json'
            }
        };

        if(Usr === usuarios[0]){
            fetchPostAdmin(urlLoginAdmin,options,UsrEmail);
        }
        else  if(Usr === usuarios[1]){
            fetchPostOdonPacien(urlLoginOdontologo,UsrEmail);
        }
        else  if(Usr === usuarios[2]){
            fetchPostOdonPacien(urlLoginPaciente,UsrEmail);
        }

    });

    function fetchPostAdmin(url, opciones,email){
        fetch(url,opciones).then(response =>{
            status = response.status
            return response.json()
        }).then(json=>{
            if(status!=200){
                alert("algo salio mal, vuelve a intentarlo")
            }
            else{
                localStorage.setItem("jwt",JSON.stringify(json));
                localStorage.setItem("email",email);
                location.replace("http://127.0.0.1:5500/vistaProyectoFinal/paciente.html");
            }
        }).catch();
    }

    function fetchPostOdonPacien(url, opciones,email){
        fetch(url,opciones).then(response =>{
            status = response.status
            return response.json()
        }).then(json=>{
            if(status!=200){
                alert("algo slaio mal, vuleve a intentarlo")
            }
            else{
                localStorage.setItem("jwt",JSON.stringify(json));
                localStorage.setItem("email",email);
                location.replace("http://127.0.0.1:5500/vistaProyectoFinal/turno.html");
            }
        }).catch();
    }

})

    