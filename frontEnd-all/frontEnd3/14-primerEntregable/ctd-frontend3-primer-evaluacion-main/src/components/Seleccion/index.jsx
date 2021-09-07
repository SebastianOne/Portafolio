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


    render() {
        return (
            <Fragment>
                <input type="button" value="A" />
                <p key={uuidv4()}>{this.state.opcionA}</p>
                <input type="button" value="B" />
                <p key={uuidv4()}>{this.state.opcionB}</p>
            </Fragment>
        )
    }



}