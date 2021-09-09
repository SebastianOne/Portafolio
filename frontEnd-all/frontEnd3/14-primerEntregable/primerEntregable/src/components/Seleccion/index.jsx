import React, { Component, Fragment } from "react";
import { v4 as uuidv4 } from "uuid";
import "./Seleccion.module.css";

export default class Seleccion extends Component {
    constructor(props) {
        super(props);
        this.state = {
            opcionA: "",
            opcionB: ""
        }
    }


    componentWillReceiveProps(nextProps){
        this.setState({
            opcionA: nextProps.opciones.a,
            opcionB: nextProps.opciones.b
        });
    }


    shouldComponentUpdate(nextProps,nextState){
        return (this.props.opcionA !== nextProps.opciones.a) || (this.state.opcionA !== nextState.opcionA);
    }


    componentDidMount(){
        this.setState({
            opcionA: this.props.opciones.a,
            opcionB: this.props.opciones.b
        });
    }


    getOpcion=(event)=>{
        this.props.cambiarSeleccion(event.target.value);
    }



    render() {
        return (
            <Fragment>
                <div className="opciones" key={uuidv4()}>
                <input className="botones" type="button" value="A" onClick={this.getOpcion}/>
                <p className="opcion" >{this.state.opcionA}</p>
                </div>
                <div className="opciones" key={uuidv4()}>
                <input className="botones" type="button" value="B" onClick={this.getOpcion}/>
                <p className="opcion" >{this.state.opcionB}</p>
                </div>
            </Fragment>
        )
    }



}
