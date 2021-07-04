import React, { Component } from 'react';
import Axios from 'axios';
import Loguinho from './componentes/loguinho';
// import Home from './componentes/home';
// import Siguinape from './componentes/siguinape';

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
        <Loguinho />
      </div>
    );
  }

}

export default App;
