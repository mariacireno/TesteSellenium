# language: pt

Funcionalidade: Preencher formularios para enviar email no site sampleapp

    Cenario: Preenchimento de formularios e submissao de email
        Dado que entrei no site "http://sampleapp.tricentis.com/101/app.php"
        Entao selecione a aba "Enter Vehicle Data"
        E preencha o formulario Vehicle Data
        Entao pressione "next" para "Enter Insurant Data"
        E preencha o formulario Insurant Data
        Entao pressione "next" para "Enter Product Data"
        E preencha o formulario Product Data
        Entao pressione "next" para "Select Price Option"
        E preencha o formulario Price Option
        Entao pressione "next" para "Send Quote"
        E preencha o formulario Send Quote
        E pressione send
        Entao verifique na tela a mensagem "Sending e-mail success!"
