import React, { Component } from 'react';
import { Grid, Row, Button, Thumbnail, Col } from 'react-bootstrap/lib'
class Comidas extends Component {
    render() {
        return(
        
            <Grid>
                <Row>
                    <Col xs={6} md={4}>
                    <Thumbnail src="../../imagens/best-sodas-coca-cola.jpg" alt="242x200">
                        <h3>Coquinha</h3>
                        <p>3 real</p>
                        <p>
                        <Button bsStyle="primary">Quero</Button>
                        </p>
                    </Thumbnail>
                    </Col>
                    <Col xs={6} md={4}>
                    <Thumbnail src="../../imagens/hot-dog-with-mustard.jpg" alt="242x200">
                        <h3>Cachorro Quente só o filé</h3>
                        <p>2 real</p>
                        <p>
                        <Button bsStyle="primary">Quero</Button>
                        </p>
                    </Thumbnail>
                    </Col>
                    <Col xs={6} md={4}>
                    <Thumbnail src="../../imagens/th.jpg" alt="242x200">
                        <h3>Pitiça</h3>
                        <p>10 real</p>
                        <p>
                        <Button bsStyle="primary">Quero</Button>
                        </p>
                    </Thumbnail>
                    </Col>
                </Row>
            </Grid>
        );
    }
}
    
export default Comidas;