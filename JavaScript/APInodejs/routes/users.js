const express = require('express');
const routes = express.Router();
const Users = require('../model/user');
const bcrypt = require('bcrypt');
const jwt = require('jsonwebtoken');
const config = require('./config/config');

//FUNÇÕES AUXILIARES
const createUserToken = (userId) => {
    return jwt.sign({ id: userId }, config.jwt_pass, {expiresIn: config.jwt_expires_in} );
}


//Código refatorado por conta do tamanho da API.
routes.get('/', async (req, res) => {
    try{
        const users = await Users.find({});
        return res.send(users);
    }
    catch (err) {
        return res.status(500).send({ error: 'Erro na consulta de usuários!'});
    } 
});

routes.post('/created', async (req, res) => {

    const { email, password } = req.body;

    if ( !email || !password ) return res.status(400).send({ error: 'Dados Insuficientes!!' })

    try{
        if (await Users.findOne({ email })) return res.status(400).send({ error: 'Usuário já registrado' });

        const user = await Users.create(req.body);
        user.password = undefined;

        return res.status(201).send({user, token: createUserToken(user.id)});
        
    }
    catch (err) {
        return res.status(500).send({ error: 'Erro ao buscar usuário' });   
    } 


});  

routes.post('/auth', async (req, res) => {

    const { email, password } = req.body;

    if ( !email || !password ) return res.status(400).send({ error: 'Dados Insuficientes!!' })

    try{
        const user = await Users.findOne({ email }).select('+password');
        if (!user) return res.status(400).send({ error: 'Usuário não registrado' });

        const pass_ok = await bcrypt.compare(password, user.password);

        if (!pass_ok) return res.status(401).send({ error: 'Erro ao autenticar o usuário!' });

        user.password = undefined;
        return res.send({user, token: createUserToken(user.id)});

    }
    catch (err) {
        return res.status(500).send({ error: 'Erro ao buscar usuário' });
    }
});

/*Código antigo, usado quando a API ainda era pequena.
routes.get('/', (req, res) => {
    Users.find({}, (err, data) => {
        if (err) return res.send({ error: 'Erro na consulta de usuários!'});
        return res.send(data);
    }); 
});

routes.post('/created', (req, res) => {

    const { email, password } = req.body;

    if ( !email || !password ) return res.send({ error: 'Dados Insuficientes!!' })

    Users.findOne({email}, (err, data) => {
        if (err) return res.send({ error: 'Erro ao buscar usuário' });
        if (data) return res.send({ error: 'Usuário já registrado' });

        Users.create(req.body, (err, data) => {
            if (err) return res.send({ error: 'Erro ao criar usuário' });

            data.password = undefined;
            return res.send(data);
        })
    })
});

routes.post('/auth', (req, res) => {

    const { email, password } = req.body;

    if ( !email || !password ) return res.send({ error: 'Dados Insuficientes!!' })

    Users.findOne({email}, (err, data) => {
        if (err) return res.send({ error: 'Erro ao buscar usuário' });
        if (!data) return res.send({ error: 'Usuário não registrado' });

        bcrypt.compare(password, data.password, (err, same) => {
            if (!same) return res.send({ error: 'Erro ao autenticar o usuário!' });

            data.password = undefined;
            return res.send(data);  
        })
    }).select('+password');
});*/



module.exports = routes;

/* RETORNO DO PROCESSAMENTO NO BANCO DE DADOS

200 = OK (deu certo, genérico, não retorna nada)
201 = created (Criação de registros) ex: ln.36
202 = acepted (Aceito, mas não terminou de processar)


problema

400 = bad request (Deu ruim, não retorna nada)
401 = unauthorized - AUTENTICAÇÃO -- tem carater temporario
403 = forbidden - AUTENTICAÇÃO -- tem carater permanente
404 = not found

500 = internal server error 
501 = not implemented - a API não suporta essa funcionalidade
503 = service unavailable - a API executa essa operação, mas no momento está indisponível

*/