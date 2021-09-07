import React, { Component, Fragment } from "react";
import { v4 as uuidv4 } from "uuid";

export default class Seleccion extends Component {
    constructor(props) {
        super(props);
        this.state = {
            opcionA: "",
            opcionB: ""
        }
    }
    componentDidMount(){
        this.setState({
            opcionA: this.props.opciones.a,
            opcionB: this.props.opciones.b
        });
    }

    shouldComponentUpdate(nextProps,nextState){
        return (this.props.opcionA !== nextProps.opciones.a) || (this.state.opcionA !== nextState.opcionA);
    }

    getOpcion=(event)=>{
        this.props.cambiarSeleccion(event.target.value);
    }



    render() {
        return (
            <Fragment>
                <input type="button" value="A" onClick={this.getOpcion}/>
                <p key={uuidv4()}>{this.state.opcionA}</p>
                <input type="button" value="B" onClick={this.getOpcion}/>
                <p key={uuidv4()}>{this.state.opcionB}</p>
            </Fragment>
        )
    }



}