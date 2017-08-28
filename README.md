## Objetivo

Desenvolvimento de um sistema de gerenciamento de biblioteca utilizando java, maven, JSF e hibernate

## Sistema de gerenciamento de Biblioteca

Este sistema será utilizado pelos funcionários da biblioteca (sem distinção entre eles)
para fazer o gerenciamento de livros emprestados.

#### Telas:
##### 1. Cadastro de livros

Nesta tela um funcionário será capaz de cadastrar novos livros.
Um livro deve ter:
 - nome
 - gênero
 - resumo
 - data de publicação

##### 2. Cadastro de clientes

Nesta tela um funcionário será capaz de cadastrar novos clientes.
Um cliente deve ter:
 - nome
 - cpf
 - e-mail

##### 3. Listagem de livros

Nesta tela é possível listar os livros exibindo:
 - nome
 - gênero
 - se esta emprestado ou disponível
 - data do empréstimo
 
Em cada linha da listagem deve ter uma ação que leve para a tela 5.

Além da listagem deve ser possível filtrar a lista por:
 - nome
 - gênero
 - resumo
 - data de publicação (a partir de ou antes de)
 - esta emprestado
 - data de empréstimo (a partir de ou antes de) 

##### 4. Listagem de clientes

Nesta tela é possível listar os clientes exibindo:
 - nome
 - e-mail
 - se tem livros
 
Em cada linha da listagem deve ter uma ação que leve para a tela 6.

Além da listagem deve ser possível filtrar a lista por:
 - nome
 - cpf
 - e-mail
 - se tem algum livro emprestado

##### 5. Detalhamento de livros

Nesta tela um funcionário será capaz de visualizar um livro.
Além de visualizar os dados cadastrais do livro, deve ser possível ver com qual cliente que esta com o livro.

A partir desta tela deve ser possível devolver um livro
(desvinculando ele do cliente e permitindo o empréstimo para outros clientes) ou acessar
as telas de edição (tela 8) ou empréstimo (tela 7)

##### 6. Detalhamento de clientes

Nesta tela um funcionário será capaz de visualizar um cliente.
Além de visualizar os dados cadastrais do cliente, deve ser possível ver uma lista de livros
que foram emprestados para este cliente.
Para cada livro da lista, deve ter uma ação que leve para a tela 5. Deve ser, também, possível acessar a tela 9

##### 7. Empréstimo de livros

Para emprestar um livro devem ser informados:
 - livro (deve vir da tela 5)
 - data e hora de empréstimo (deve vir preenchido com a data e hora atual)
 - cliente (deve ser selecionado partir de uma lista)

##### 8. Edição de livros

Nesta tela deve ser possível editar todas as informações que foram preenchidas na tela 1

#### 9. Edição de clientes

Nesta tela deve ser possível editar todas as informações que foram preenchidas na tela 2