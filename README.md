<h1 align="center">
  API para gerenciamento de clientes e compras
</h1>

API para gerenciar as compras, usuários e pagamentos utilizando os princípios do (CRUD).

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Hibernate](https://hibernate.org/orm/documentation/6.5/)
- [PostgreSQL](https://www.postgresql.org/download/)
- [Postman](https://www.postman.com/product/api-client/)
- [Heroku](https://devcenter.heroku.com/)

## Práticas adotadas

- SOLID, DRY
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Práticas de banco de dados usando PostgreSQL, SQL
- Ferramenta de requisição Postman
- Deploy com Heroku


## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Postman (https://www.postman.com/product/api-client/):

- Consultar os clientes pelo Id e lista total de cadastrados e suas compras (GET)
```
http://localhost:8080/users/id


http://localhost:8080/users
```

- Cadastrar os clientes (POST)
```
http://localhost:8080/users
[
  {
    "name": "Zé Pereira",
    "email": "ze.pereiraa@gmail.com",
    "phone": "1188569974",
    "password": "123456"
}
]
```

- Atualizar os clientes cadastrados pelo id (PUT)
```
http://localhost:8080/users/id
[
  {
    "name": "Zé Silveiro",
    "email": "ze.silveiro@gmail.com",
    "phone": "1199978564",
}
]
```

- Deletar os clientes cadastrados pelo id (DEL)
```
http://localhost:8080/users/id
```
