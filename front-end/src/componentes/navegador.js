import React, { Component } from 'react';
import { Nav, Navbar, MenuItem, NavItem, NavDropdown, ListGroup, ListGroupItem } from 'react-bootstrap/lib'
class Navegador extends Component {
    render() {
        return(
            <Navbar bsStyle='inverse'>
                <Navbar.Header>
                    <Navbar.Brand>
                    <a href="#home">React Food</a>
                    </Navbar.Brand>
                </Navbar.Header>
     
                <Nav pullRight>
                <NavItem eventKey={1} href="/loguinho.html">
                   Loguinho
                </NavItem>
                <NavItem eventKey={2} href="#">
                    Siguinap
                </NavItem>
                    <NavDropdown eventKey={3} title="Carrinho" id="basic-nav-dropdown">
                    <ListGroup>
                        <ListGroupItem>Item 1</ListGroupItem>
                        <ListGroupItem>Item 2</ListGroupItem>
                        <ListGroupItem>...</ListGroupItem>
                    </ListGroup>
                    <MenuItem divider />
                    <MenuItem  eventKey={3.4} >Confirmar Compra</MenuItem>
                    </NavDropdown>
                </Nav>
            </Navbar>

        );
    }
}

export default Navegador;