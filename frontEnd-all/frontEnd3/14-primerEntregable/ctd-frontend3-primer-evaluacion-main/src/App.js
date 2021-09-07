import Aventura from "./components/Aventura";
import Seleccion from "./components/Seleccion";
import Historial from "./components/Historial";
import React, { Component, Fragment } from "react";
import datos from "./components/data.json"

class App extends Component{
  constructor(){
    super();
    this.sizeCaminosArreglo = 5
    this.state={
      posicion: 0,
      seleccionAnterior: "",
      historial: []
    }
  }


  handleClick= (seleccion)=>{
    let posicion = this.state.posicion + 1;
    if(posicion >= this.sizeCaminosArreglo){
      this.setState({
        posicion: 0, 
        seleccionAnterior: "",
        historial: []
      })

    }else{
      let arreglo = this.state.historial
      arreglo.push(seleccion);
      this.setState({
        posicion: posicion, 
        seleccionAnterior: seleccion,
        historial: arreglo
      })
      
    }
  };

  getElementoDatos=()=>{
    if(this.state.posicion === 0)
      return datos[0]
    else{
      let posicion = this.state.posicion + 1;
      let id = posicion + this.state.seleccionAnterior.toLowerCase();
      return datos.find(elemento=>elemento.id === id)
    }

  }


  render(){
    return(
      <Fragment>
        <div className="layout">
          <Aventura parrafo={this.getElementoDatos().historia}/>
          <Seleccion opciones={this.getElementoDatos().opciones} cambiarSeleccion={this.handleClick}/>
          <Historial historial={this.state.historial} seleccionAnterior={this.state.seleccionAnterior}/>
        </div>
    </Fragment>

    )
  }
}


export default App;
