import React, { Component } from 'react';
import { ControlLabel, FormControl, FormGroup, Col, Checkbox, Form, Button} from 'react-bootstrap/lib'
import Navegador from './navegador';
class Loguinho extends Component {

        constructor(props, context) {
            super(props, context);
        
            this.handleChange = this.handleChange.bind(this);
        
            this.state = {
              value: ''
            };
          }
        
          getValidationState() {
            const length = this.state.value.length;
            if (length > 10) return 'success';

            else if (length > 5) return 'warning';

            else if (length > 0) return 'error';
            return null;
          }
        
          handleChange(e) {
            this.setState({ value: e.target.value });
          }
        
        render() {
            return(
            <div>
             <Navegador />
             <Form horizontal>
                <FormGroup controlId="formHorizontalEmail">
                    <Col componentClass={ControlLabel} sm={2}>
                    Email
                    </Col>
                    <Col sm={10}>
                    <FormControl type="email" placeholder="Email" />
                    </Col>
                </FormGroup>

                <FormGroup controlId="formHorizontalPassword">
                    <Col componentClass={ControlLabel} sm={2}>
                    Password
                    </Col>
                    <Col sm={10}>
                    <FormControl type="password" placeholder="Password" />
                    </Col>
                </FormGroup>

                <FormGroup>
                    <Col smOffset={2} sm={10}>
                    <Checkbox>Remember me</Checkbox>
                    </Col>
                </FormGroup>

                <FormGroup>
                    <Col smOffset={2} sm={10}>
                    <Button type="submit">Sign in</Button>
                    </Col>
                </FormGroup>
            </Form>;
          </div>
        );
    }
}
    
export default Loguinho;