const jwt = require('jsonwebtoken');
const config = require('./config/config');

const auth = (req, res, next) => {
    const token_header = req.headers.auth;

    if (!token_header) return res.status(401).send({ error: 'Insira o token!'})

    jwt.verify(token_header, config.jwt_pass, (err, decoded) => {
        if (err) return res.status(401).send ({ error: 'Token inválido'});

        res.locals.auth_data = decoded;

        return next();
    })
}

module.exports = auth;

/*  "user": {
"_id": "5d1a54a747e3df3758f982ad",
"email": "testetoken@gmail.com",
"created": "2019-07-01T18:44:55.848Z",
"__v": 0
},
"token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVkMWE1NGE3NDdlM2RmMzc1OGY5ODJhZCIsImlhdCI6MTU2MjAwNjY5NiwiZXhwIjoxNTYyNjExNDk2fQ.7T1KvHnjK6mUYUEa6o6ly_tpAGN0n1sIJYqKPJNgKug"
}
*/