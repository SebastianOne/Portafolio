import React, { Component} from "react";
import { v4 as uuidv4 } from "uuid";
import "./Historial.module.css";


export default class Historial extends Component {
    constructor(props) {
        super(props);
        this.state = {
            seleccionAnterior: "",
            historial: []
        }
    }
    componentWillReceiveProps(nextProps){
        this.setState({
            seleccionAnterior: nextProps.seleccionAnterior,
            historial: nextProps.historial
        });
    }


    componentDidMount(){
        this.setState({
            seleccionAnterior: this.props.seleccionAnterior,
            historial: this.props.historial
        });
    }





    render() {
        
        return (
            <div className="recordatorio">
                <p>Selección anterior: {this.state.seleccionAnterior}</p>
                <p>Historial de opciones elegidas</p>
                <ul>
                    {this.state.historial.map(elemento => <li key={uuidv4()} type="disc">{elemento}</li>)}
                </ul>
            </div>
        )
    }






}