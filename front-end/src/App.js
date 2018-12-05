import React, { Component } from 'react';
import Navegador from './componentes/navegador';
import Comidas from './componentes/comidas';
import Axios from 'axios';

class App extends Component {

  dothefuckingrequest(){
    let endpoint = "https://jsonplaceholder.typicode.com/"
    let resource = "comments"
    Axios.get(endpoint+resource).then(function(resposta){
      console.log(resposta.data)
    }).catch(function(erro){
      console.log(erro)
    })
  }

  render() {
    return (
      <div>
        <Navegador />
        <Comidas />
      </div>
    );
  }

}

export default App;
