function puedeSubir(altura,acompañado,penalizacion){
   
    if(penalizacion != true){

        if(altura >= 1.40 && altura<2){
            return true;
    
        }
        else if(altura<1.40 && altura>=1.20 && acompañado === true ){
            return true;
    
        }
        else{
            return false;
    
        }

    }
    else{
        return false;
    }
   
    

}


function puedeSubir3(altura,acompañado,penalizacion){
   
    if(penalizacion != true){

        if((altura >= 1.40 && altura<2) || (altura<1.40 && altura>=1.20 && acompañado === true )){
            return true;
    
        }
        else{
            return false;
    
        }

    }
    else{
        return false;
    }
   
    

}

/* forma dos de hacerlo, esta forma no me gusta porque es un poco desordenado */ 

let puedeSubir2 = (altura,acompañado,penalizado) => {return (penalizado != true && ((altura >= 1.40 && altura<2) || (altura<1.40 && altura>=1.20 && acompañado === true)))};

console.log(puedeSubir2(1.8, false,false))
console.log(puedeSubir(1.8,false,false))