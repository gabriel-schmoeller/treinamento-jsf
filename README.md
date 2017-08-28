## Objetivo

Desenvolvimento de um sistema de gerenciamento de biblioteca utilizando java, maven, tomcat, JSF (PrimeFaces) e hibernate

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

## Material de apoio

#### GIT
Iniciar um projeto a partir de um remoto:
 - `git clone <url_do_projeto>` | para fazer uma copia local do projeto, a <url_do_projeto> pode ser encontrada no botão "Clone or Download"

Criação de branch:
 - `git branch -a` | exibe os branchs existentes no projeto. Branco: branches baixados ou locais;
 Vermelho: apenas remotos; Verde: o que esta trabalhando no momento.
 - `git branch <nome_do_branch>` | cria um branch com o nome equivalente ao <nome_do_branch>
 - `git checkout <nome_do_branch>` | altera o branch que esta trabalhando atualmente para o <nome_do_branch>. Se executar o primeiro
 - `git checkout -b <nome_do_branch>` | equivalente a executar os 2 últimos comandos em sequencia 
 comando da lista, este branch deverá estar verde.

Fluxo de trabalho:
 - `git status` | exibe os arquivos que foram alterados em relação ao ultimo commit
 - `git add <caminho_do_arquivo>` | adiciona o arquivo <caminho_do_arquivo> a lista de arquivos prontos para commit
 - `git add .` | adiciona todos os arquivos alterados a lista de arquivos prontos para commit
 - `git commit -m "<mensagem_de_commit>"` | cria um commit com a mensagem <mensagem_de_commit> contendo
 todos os arquivos que foram adicionados
 - `git log -<numero_de_commits>` | exibe os últimos n (onde n é equivalente a <numero_de_commits>) números de
 commits que que o branch atual possui
 - `git log` | exibe todos os commits existentes no branch (para sair da listagem pressione a tecla "q")
 - `git pull origin <branch_remoto>` | baixa as alterações que foram feitas no <branch_remoto> e ainda não existem localmente
 - `git push origin <branch_local>:<branch_remoto>` | envia todas as alterações commitadas no <branch_local> para o
 <branch_remoto> do repositório remoto
 - `git push origin <branch>` | semelhante ao comando anterior, porém se o nome do branch local e remoto forem exatamente
 o mesmo é possível informar apenas o nome do <branch>

#### Maven
Estrutura de diretórios recomendada:
 ```
 treinamento-jsf
 +--src
 |  +--main
 |     +--java
 |     +--resources
 +--pom.xml
 ```
 - java: diretório onde ficaram os códigos fontes em java
 - resources: diretório onde ficaram os recursos do projeto que não são java.
 Ex de extensões: .xml (normalmente de configuração), .properties (normalmente de configuração), .html, .xhtml, .imagens, .css
 - pom.xml: arquivo de configurações do maven (https://maven.apache.org/pom.html)

Arquivo de configurações do maven (pom.xml)
 ```xml
 <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
  
    <groupId>nome.sobrenome</groupId>
    <artifactId>treinamento-jsf</artifactId>
    <version>0.0.1</version>
    <packaging>war</packaging>
    <name>Aplicação de treinamento jsf</name>
  
    <properties>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
    </properties>
    
    <repositories>
  
    </repositories>
  
    <dependencies>
  
    </dependencies>
 </project>
 ```
 - `<groupId>`: Nome da pessoa ou empresa responsável pelo projeto
 - `<artifactId>`: Nome do projeto (deve ser único entre os projetos desse groupId)
 - `<version>`: Versão do projeto
 - `<packaging>`: Tipo de empacotamento jar (desktop), war (web), ear, zip... que será feito ao rodar o comando `package`
 - `<name>`: Nome legível da aplicação
 - `<repositories>`: dentro desta tag devem ser colocadas as tags <repository>, que servem para referenciar um
 repositório externo, ao qual o maven ira tentar procurar as dependências antes de baixar do repositório global pré configurado  
 - `<dependencies>`: dentro desta tag devem ser colocadas as tags <dependency> das dependências
 que precisar utilizar no projeto

Comandos:
 - `mvn clean`: deleta a pasta target a qual os arquivos compilados se encontram
 - `mvn compile`: executa os comandos anteriores, baixa as dependências necessárias e compila as classes java do
 projeto e coloca os arquivos .class dentro da pasta target
 - `mvn package`: executa os comandos anteriores e coloca os arquivos .class dentro de um arquivo comprimido,
 que por padrão e um .jar
 - `mvn install`: executa os comandos anteriores e coloca o arquivo comprimido dentro do seu repositório local,
 normalmente encontrado em `C:\Users\<seu_usuario>\.m2\repository`

#### JSF (PrimeFaces)

Para o desenvolvimento de tela com JSF, utilize o PrimeFaces. A documentação com os componentes existentes
estão em: https://www.primefaces.org/showcase/

Um bom tutorial para começar um projeto com PrimeFaces: https://www.mkyong.com/jsf2/primefaces/primefaces-hello-world-example/

#### Tomcat

Para rodar um projeto java web, é necessário um servidor de aplicação (Jboss, Wildfly, GlassFish, WebLogic...).
Para este projeto recomendo o uso de Tomcat, pela simplicidade.

 1. Faça o download do tomcat em: http://tomcat.apache.org/download-80.cgi (Binary Distributions > Core > zip)
 2. Extraia para um diretório de sua preferência
 3. No intellij confirmar se o plugin do tomcat esta ativado: "File > Settings > Plugins > Tomcat and TomEE integration"
 4. Com o plugin ativado. Na tela principal do Intellij va no canto superior direto em uma pequena combobox
 e entre em "Edit Configurations"
 5. Clique no icone verde de "+" > Tomcat Server > Local
 6. Clique no botão "Configure..."  ao lado do campo "Application server"
 7. No campo "Tomcat Home" coloque o caminho onde o tomcat foi extraido. Ex: `C:\Users\usuario\workspace\apache-tomcat-8.5.12`
 8. Após o intellij deve preeencher os outros campos automaticamente. Feito isso apenas pressione "OK"
 9. Com Essas alterações, altere o "Name" e de um "Apply"
 10. O passo a seguir só poderá ser feito se já tiver configurado o pom.xml pelo menos com `<packaging>` e `<name>`
 11. Após estas configurações vá na aba "Deployment > + (verde a direita) > Artifact..."
 12. Nesta tela selecione o registro equivalente a "<artifactId>:war exploded" e de "OK" e "OK" para voltar a tela inicial da IDE
 13. Com estas configurações concluidas, basta rodar o servidor de aplicação para fazer a aplicação funcionar, para fazer isto
 va novamente na combobox que fomos no passo 4 e selecione o registro contendo o nome que foi salvo no passo 9
 14. Por fim clique na seta verde ao lado da combobox anterior e o servidor deve subir junto com a aplicação