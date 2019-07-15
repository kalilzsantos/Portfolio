const env = process.env.NODE_ENV || 'dev';

const config = () => {
    switch (env) {
        case 'dev':
        return{
            bd_string: 'mongodb+srv://user_admin:Kalil81582923@clusteapi-c26bj.mongodb.net/test?retryWrites=true&w=majority',
            jwt_pass: 'admin@123',
            jwt_expires_in: '7d'
        }

        case 'hml':
        return{
            bd_string: 'mongodb+srv://user_admin:Kalil81582923@clusteapi-c26bj.mongodb.net/test?retryWrites=true&w=majority',
            jwt_pass: 'hml@123',
            jwt_expires_in: '7d'
        }

        case 'prod':
        return{
            bd_string: 'mongodb+srv://user_admin:Kalil81582923@clusteapi-c26bj.mongodb.net/test?retryWrites=true&w=majority',
            jwt_pass: 'prod@123',
            jwt_expires_in: '7d'
        }

    }
}

console.log('Iniciando a API em ambiente');

module.exports = config();