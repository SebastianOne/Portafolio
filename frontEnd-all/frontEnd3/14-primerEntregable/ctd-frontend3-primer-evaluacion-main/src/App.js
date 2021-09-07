import Aventura from "./components/Aventura";
import Seleccion from "./components/Seleccion";
import Historial from "./components/Historial";
import React, { Fragment } from "react";
import datos from "./components/data.json"

function App() {
  return (
    <Fragment>
      <div className="App">
        <Aventura />
        <Seleccion />
        <Historial />
      </div>
    </Fragment>

  );
}

export default App;
