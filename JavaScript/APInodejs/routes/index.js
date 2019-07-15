const express = require('express');
const routes = express.Router();
const auth = require('../middlewares/auth')

routes.get('/', auth, (req, res) => {
    console.log(res.locals.auth_data);
    return res.send({message: 'Cada usuário tem uma mensagem restrita.'})
});

routes.post('/', (req, res) => {
    return res.send({message: 'Tudo ok com o metodo post da raiz'})
});

module.exports = routes;    