# Projeto Spring Data JPA

Este é um projeto de exemplo que demonstra como usar o Spring Data JPA para persistência de dados em um banco de dados utilizando o Spring Boot.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.3.1
- Spring Data JPA
- H2 Database (em memória)

## Descrição das Classes

### 1. SpringDataJpaApplication

Esta é a classe principal do projeto Spring Boot. Ela inicializa a aplicação Spring Boot.

### 2. StartApp

Classe `StartApp` implementa `CommandLineRunner`, o que significa que ela será executada ao iniciar a aplicação. Ela cria e salva um objeto `User` no banco de dados H2 e, em seguida, recupera todos os usuários salvos e os imprime no console.

### 3. User

Classe `User` é uma entidade JPA que representa a tabela de usuários no banco de dados. Ela contém campos como `id`, `username`, `password` e `name`, que são mapeados para colunas no banco de dados.

### 4. UserRepository

Interface `UserRepository` estende `JpaRepository`, que fornece métodos CRUD básicos para a entidade `User`, como `save`, `findAll`, `findById`, entre outros. Esses métodos são implementados automaticamente pelo Spring Data JPA.

## Configuração do Banco de Dados

Neste projeto, está sendo utilizado um banco de dados H2 em memória para facilitar o desenvolvimento e os testes. A configuração do banco de dados pode ser encontrada no arquivo `application.properties`.

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
```

## Como Executar o Projeto

1. Certifique-se de ter o JDK 17 instalado em seu sistema.
2. Clone o repositório para sua máquina local.
3. Navegue até o diretório do projeto e execute o seguinte comando no terminal:

   ```
   mvn spring-boot:run
   ```

4. A aplicação Spring Boot será iniciada. Você poderá ver as mensagens de inicialização no console.

5. Após a inicialização, a classe `StartApp` será executada automaticamente, criando um novo usuário no banco de dados e imprimindo todos os usuários existentes.

6. Verifique o console para ver os resultados da execução.

## Observações

- Este projeto utiliza o H2 Database em memória. Se desejar utilizar outro banco de dados, ajuste as configurações em `application.properties`.
- Certifique-se de ter configurado corretamente as dependências e o plugin do Spring Boot no arquivo `pom.xml`.

---

Este README fornece uma visão geral básica do projeto Spring Data JPA, 
explicando suas classes principais, a configuração do banco de dados e como 
executar o projeto. Você pode adicionar mais detalhes conforme necessário, 
como instruções de instalação, configuração do ambiente de desenvolvimento, 
ou detalhes sobre outras funcionalidades implementadas.

Claro! Abaixo está uma sugestão de assinatura para o seu projeto Spring Data JPA, que você pode adicionar ao final do README:

---

### Autor

Este projeto foi desenvolvido por **Ari Junior**

- **LinkedIn:** https://www.linkedin.com/in/arijunior09/
- **GitHub:** https://github.com/AriJunior09

### Recursos do Spring

- **Documentação do Spring Boot:** [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
- **Documentação do Spring Data JPA:** [https://spring.io/projects/spring-data-jpa](https://spring.io/projects/spring-data-jpa)
- **Guia do Spring Framework:** [https://spring.io/guides](https://spring.io/guides)

---

