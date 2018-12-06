import React, { Component } from 'react';
import Navegador from './navegador';
import Comidas from './comidas';

class Home extends Component {
    render() {
        return(
            <div>
                <Navegador />
                <Comidas />
            </div>
        );
    }
}

export default Home;