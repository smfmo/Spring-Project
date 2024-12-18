
# Projeto CRUD de Produtos com PostgreSQL, Java, Spring Boot e APIs REST

Este projeto consiste em um CRUD (Create, Read, Update, Delete) de produtos desenvolvido em **Java** utilizando o framework **Spring Boot**. O sistema foi projetado para realizar transações com um banco de dados **PostgreSQL**, permitindo a criação, leitura, atualização e exclusão de produtos por meio de APIs REST.

## Tecnologias Utilizadas

- **Java**: Linguagem principal para o desenvolvimento do backend.
- **Spring Boot**: Framework utilizado para facilitar a criação de aplicações Java.
- **Spring Data JPA**: Biblioteca para integração e manipulação de dados no banco de dados.
- **PostgreSQL**: Banco de dados relacional utilizado no projeto.
- **Flyway**: Ferramenta para controle e migração de versões do banco de dados.
- **Indomnia**: Utilizado para auxiliar no desenvolvimento das APIs REST.

## Funcionalidades

- **Criar Produto**: Adiciona um novo produto ao banco de dados.
- **Consultar Produtos**: Retorna uma lista de produtos ou um produto específico pelo seu identificador (ID).
- **Atualizar Produto**: Permite modificar os dados de um produto existente.
- **Deletar Produto**: Remove um produto do banco de dados.

## Estrutura do Projeto

1. **Entidade (Classe de Modelo)**:
   - Representa a tabela de produtos no banco de dados.
   - Contém os atributos correspondentes às colunas da tabela, com os mesmos tipos e definições.

2. **DTO (Data Transfer Object)**:
   - Garante boas práticas ao evitar que a classe de entidade seja exposta diretamente.
   - Facilita a transição de dados entre as camadas da aplicação.

3. **Repository**:
   - Contém os métodos responsáveis pelas operações no banco de dados.
   - Utiliza o **Spring Data JPA** para simplificar as consultas e manipulações.

4. **Controller**:
   - Gerencia as requisições HTTP e as respostas do sistema.
   - Implementa a lógica para atender às requisições REST e realiza as transações necessárias.



## Endpoints Disponíveis

- `POST /products`: Cria um novo produto.
- `GET /products`: Retorna todos os produtos.
- `GET /products/{id}`: Retorna um produto pelo ID.
- `PUT /products/{id}`: Atualiza um produto pelo ID.
- `DELETE /products/{id}`: Deleta um produto pelo ID.

## Contribuição

Sinta-se à vontade para contribuir com melhorias para este projeto. Para isso, siga os passos:

1. **Faça um fork do repositório**.
2. **Crie uma branch para sua feature ou correção**.
3. **Envie um Pull Request com a descrição das alterações realizadas**.

## Autor

Este projeto foi desenvolvido por [Seu Nome]. Caso tenha dúvidas ou sugestões, sinta-se à vontade para entrar em contato.
