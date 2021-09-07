import React, { Component} from "react";
import "./Aventura.module.css";

export default class Aventura extends Component {
    constructor(props) {
        super(props);
        this.state = {
            parrafoPrincipal: ""
        }
    }


    componentWillReceiveProps(nextProps){
        this.setState({parrafoPrincipal: nextProps.parrafo});
    }


    shouldComponentUpdate(nextProps,nextState){
        const respuesta = (this.props.parrafo !== nextProps.parrafo) || (this.parrafoPrincipal !== nextState.parrafoPrincipal)
        return respuesta;
    }

    componentDidMount(){
        this.setState({parrafoPrincipal: this.props.parrafo});
    }



    render() {
        return (
            <div className="historia">
                <p>{this.state.parrafoPrincipal}</p>
            </div>
        )
    }








}