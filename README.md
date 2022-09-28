<h1 align="center">
  Fluxo de Caixa - Transações financeiras
</h1>

<p align="center">
  
  <img alt="GitHub language count" src="https://img.shields.io/github/last-commit/diegomrz/fxcx">
  
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/diegomrz/fxcx">

  <a href="https://www.linkedin.com/in/diegomrz/">
    <img alt="Made by diegomrz" src="https://img.shields.io/badge/linkedin-diegomrz-blue">
  </a>  
</p>

## Fluxo de Caixa
Essa será uma aplicação de fluxo de caixa deve armazenar transações financeiras de entrada e saída e permitir o cadastro e a listagem dessas transações, assim como deletar e alterar tendo assim o CRUD completo.

### Rotas da aplicação

Agora que você já está com o template clonado e pronto para continuar, você deve verificar os arquivos da pasta src e completar onde não possui código com o código para atingir os objetivos de cada rota.

- POST /transactions: A rota deve receber title, value, type, e category dentro do corpo da requisição, sendo o type o tipo da transação, que deve ser income para entradas (depósitos) e outcome para saídas (retiradas). Ao cadastrar uma nova transação, ela deve ser armazenada dentro do seu banco de dados, possuindo os campos id, title, value, type, category_id, created_at, updated_at.

Dica: Para a categoria, você deve criar uma nova tabela, que terá os campos id, title, created_at, updated_at.

Dica 2: Antes de criar uma nova categoria, sempre verifique se já existe uma categoria com o mesmo título. Caso ela exista, use o id já existente no banco de dados.
```bash
{
  "id": "uuid",
  "title": "Salário",
  "value": 3000,
  "type": "income",
  "category": "Alimentação"
}
```

- GET /transactions: Essa rota deve retornar uma listagem com todas as transações que você cadastrou até agora, junto com o valor da soma de entradas, retiradas e total de crédito. Essa rota deve retornar um objeto com formato a ser definido:

- UPDATE /transactions/:id: A rota deve deletar uma transação com o id presente nos parâmetros da rota;

- DELETE /transactions/:id: A rota deve deletar uma transação com o id presente nos parâmetros da rota;


Funcionalidades:
- Permitir que uma transação seja criada, e retorne um json com a transação criado.
- Permitir que ao criar uma nova transação com uma categoria que não existe, essa seja criada e inserida no campo category_id da transação com o id que acabou de ser criado.
- Permitir que ao criar uma nova transação com uma categoria que já existe, seja atribuído ao campo category_id da transação com o id dessa categoria existente, não permitindo a criação de categorias com o mesmo title.
- Permitir que seja retornado um array de objetos contendo todas as transações junto ao balanço de income, outcome e total das transações que foram criadas até o momento.
- Não permitir que uma transação do tipo outcome extrapole o valor total que o usuário tem em caixa (total de income), retornando uma resposta com código HTTP 400 e uma mensagem de erro no seguinte formato: { error: string }.
- Permitir que a sua rota de delete exclua uma transação, e ao fazer a exclusão, ele retorne uma resposta vazia, com status 204.


Tecnologias
- BackEnd
LINGUAGEM
https://www.java.com/pt-BR/
FRAMEWORKS
https://start.spring.io/
https://camel.apache.org/
https://camel.apache.org/camel-spring-boot/3.18.x/spring-boot.html
IDE
https://www.jetbrains.com/idea/
- Testes
Todas as rotas da aplicação devem ser testáveis através do Insomnia.
Insomnia
https://insomnia.rest/download
- Banco de Dados
Funcionalidade:
CRUD completo para armazenar, consultar, alterar e deletar transações.
O centro do BD são as transações, como acessório, devemos ter o registro de clientes, contas e contratos de transação.
Postgres Instalado via Docker
https://www.docker.com/
(Postgres será instalado via Docker)
- Front-End
Site simples com javascript para fazer as requisições.
Funcionalidade:
Lojinha com o botão comprar, consultar compra e relatar fraude.  
https://nodejs.org/en/
