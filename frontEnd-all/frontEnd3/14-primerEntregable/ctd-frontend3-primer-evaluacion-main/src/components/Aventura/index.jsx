import React, { Component, Fragment } from "react";

export default class Aventura extends Component {
    constructor(props) {
        super(props);
        this.state = {
            parrafoPrincipal: ""
        }
    }
    componentDidMount(){
        this.setState({parrafoPrincipal: this.props.parrafo});
    }

    shouldComponentUpdate(nextProps,nextState){
        return (this.props.parrafo !== nextProps.parrafo) || (this.parrafoPrincipal !== nextState.parrafoPrincipal);
    }


    render() {
        return (
            <Fragment>
                <p>{this.state.parrafoPrincipal}</p>
            </Fragment>
        )
    }








}