import React, { Component, Fragment } from "react";
import { v4 as uuidv4 } from "uuid";

export default class Historial extends Component {
    constructor(props) {
        super(props);
        this.state = {
            seleccionAnterior: "",
            historial: []
        }
    }

    render() {
        return (
            <Fragment>
                <p>Selección anterior: {this.state.seleccionAnterior}</p>
                <p>Historial de opciones elegidas</p>
                <ul>
                    {this.state.historial.map(elemento => <li key={uuidv4()} type="disc">{elemento}</li>)}
                </ul>
            </Fragment>
        )
    }






}