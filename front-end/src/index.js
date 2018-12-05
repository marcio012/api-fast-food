import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import Loguinho from './componentes/loguinho';
import Siguinape from './componentes/siguinape';
import * as serviceWorker from './serviceWorker';
import { createMemoryStory, Router, Route } from 'react-router';


ReactDOM.render(<App/>/* (
    {<Router history={ createMemoryStory }>
      <Route path='/' component={App}>
        <Route path='loguinho' component={Loguinho}/>
        <Route path='siguinape' component={Siguinape} />
      </Route>
    </Router>}
  ) */, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
