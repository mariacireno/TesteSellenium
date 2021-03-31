# Teste Selenium
> Criar um projeto em Selenium WebDrive e Cucumber usando Page Objects Model (POM) <br>

> Status do Projeto: Concluído :heavy_check_mark:<br>

#### Autora: Maria Cireno<br>

---------------------------------------------------------------------------
### Caso de teste <br>
Preencher formulários para enviar email no site Sampleapp<br>

#### Cenário:<br>
Preenchimento de formulários e submissão de email<br>
   - [x] Dado que entrei no site "http://sampleapp.tricentis.com/101/app.php"<br>
   - [x] Entao selecione a aba "Enter Vehicle Data"
   - [x] E preencha o formulario Vehicle Data
   - [x] Entao pressione "next" para "Enter Insurant Data"
   - [x] E preencha o formulario Insurant Data
   - [x] Entao pressione "next" para "Enter Product Data"
   - [x] E preencha o formulario Product Data
   - [x] Entao pressione "next" para "Select Price Option"
   - [x] E preencha o formulario Price Option
   - [x] Entao pressione "next" para "Send Quote"
   - [x] E preencha o formulario Send Quote
   - [x] E pressione send
   - [x] Entao verifique na tela a mensagem "Sending e-mail success!"

---------------------------------------------------------------------------

---------------------------------------------------------------------------
### Tecnologias utilizadas<br>

   *  Java: Linguagem de programacão para desenvolvedores orientada a objeto<br>
   *  Maven: Gerenciador de dependências para o Java<br>
   *  Cucumber: Framework responsável por traduzir uma linguagem humana em código Java utilizando algumas palavras reservadas<br>
   *  Selenium: Framework responsável por fazer a integracão do código Java com a linguagem Gherkin (Cucumber) e automatizando os testes<br>
---------------------------------------------------------------------------
### Pré-requisitos<br>

   1. Instalar o Java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR<br>
   2. Instalar JDK: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html<br>
   3. Verificar se o JAVA_HOME está configurado no seu computador<br>

---------------------------------------------------------------------------     
### Para clonar o projeto<br> 

```bash
git clone > https://github.com/mariacireno/TesteSellenium.git
```
### Configurando Selenium no seu computador<br>

Este projeto já contém os Webdrivers para Unix e Windows e está configurado para rodar sem necessitar desse passo<br>
Caso encontre problemas realizar o seguinte procedimento:

Fazer download do Chrome Webdriver e colocar o arquivo descompactado da pasta driver na raiz do projeto<br>
>https://chromedriver.chromium.org/downloads<br>

##### Exemplo<br>

```bash
cd driver >https://chromedriver.storage.googleapsis.com/89.0.4389.23/chrome_1inux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver<br>
```
### Instruções para rodar<br>
#### Entrar no diretório onde foi clonado o projeto (exemplo):
```bash
cd ~/workspace/projects/TesteSellenium
```
#### Executando teste no Unix:
```bash
./test.sh
```
#### Executando teste no Windows:
```bash
test.bat
```
### Instruções para limpar e validar o Maven<br>
#### Executar o seguinte comando no Windows:
```bash
mvnw.cmd clean<br>
```

#### Executar o seguinte comando no Unix:
```bash
./mvnw clean
```
### Validando os testes<br>
Ao final da execução, caso o procedimento obtenha sucesso, o terminal deve apresentar a seguinte mensagem:<br>

![](/data/build_success.png)


---------------------------------------------------------------------------
## Estrutura de arquivos
<pre>
data
    |-- build_success.png -- Imagem que compõe o README.md
driver
    |-- chromedriver -- Selenium webdriver para unix, substitua este arquivo com a versão da sua máquina
    |-- chromedriver.exe -- Selenium webdriver para windows, substitua este arquivo com a versão da sua máquina
src
    |-- main
    |  |-- java
    |  |  |-- io
    |  |  |  |-- cucumber
    |  |  |  |  |-- maria (vazio)
    |-- test
    |  |-- java
    |  |  |-- io
    |  |  |  |-- cucumber
    |  |  |  |  |-- helpers
    |  |  |  |  |  |-- StringHelper.java -- Classe com funções para manipulação de Strings
    |  |  |  |  |  |-- TestHelper.java -- Classe com configuração do browser e funções auxiliares dos testes
    |  |  |  |  |-- maria
    |  |  |  |  |  |-- FormSteps.java -- Classe com os passos do cenário que executa o teste
    |  |  |  |  |  |-- RunCucumberTest.java -- Classe que configura a inicialização do Java test
    |  |  |  |  |-- pages
    |  |  |  |  |  |-- InsurantPage.java -- Classe com o objeto da página Insurant para obedecer à modelagem POM
    |  |  |  |  |  |-- NavigationPage.java -- Classe com o objeto da página Navigation que realiza as operações básicas de navegação
    |  |  |  |  |  |-- PricePage.java -- Classe com o objeto da página Price para obedecer à modelagem POM
    |  |  |  |  |  |-- ProductPage.java -- Classe com o objeto da página Product para obedecer à modelagem POM
    |  |  |  |  |  |-- QuotePage.java -- Classe com o objeto da página Quote para obedecer à modelagem POM
    |  |  |  |  |  |-- Vehicle.java -- Classe com o objeto da página Vehicle para obedecer à modelagem POM
    |  |-- resources
    |  |  |-- io
    |  |  |  |-- cucumber
    |  |  |  |  |-- maria
    |  |  |  |  |  |-- formsFill.feature -- Gherkin com o cenário de teste de acordo com o que o cliente solicitou
  mvnw -- Arquivo sobre qual versão foi utilizada no projeto
  mvnw.cmd -- Arquivo de como deve ser feita a configuração do Maven
  pom.xml -- Arquivo com todas as dependências utilzadas no projeto
  README.md -- Arquivo com a documentação do projeto
  test.bat -- Arquivo para rodar teste no Windows
  test.sh -- Arquivo para rodar teste no Unix
  </pre>
