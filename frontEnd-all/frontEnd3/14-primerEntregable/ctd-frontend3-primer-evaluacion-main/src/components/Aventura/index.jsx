import React, { Component, Fragment } from "react";

export default class Aventura extends Component {
    constructor(props) {
        super(props);
        this.state = {
            parrafoPrincipal: ""
        }
    }

    render() {
        return (
            <Fragment>
                <p>{this.state.parrafoPrincipal}</p>
            </Fragment>
        )
    }








}