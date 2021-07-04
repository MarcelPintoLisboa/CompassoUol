$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Projeto.feature");
formatter.feature({
  "name": "Validar inserção do look no carrinho de compras",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validar inserção do look no carrinho de compras",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "como comprador quero buscar um look \u003cLook\u003e no sistema",
  "keyword": "Dado "
});
formatter.step({
  "name": "adiciono no carrinho de compras",
  "keyword": "Quando "
});
formatter.step({
  "name": "preciso verificar se o look \u003cproduto\u003e \u003cpreço_esperado\u003e encontra-se no carrinho de compras",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "Look",
        "produto",
        "preço_esperado"
      ]
    },
    {
      "cells": [
        "\"Faded Short Sleeve\"",
        "\"Faded Short Sleeve T-shirts\"",
        "\"$16.51\""
      ]
    }
  ]
});
formatter.background({
  "name": "Abrir sistema",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "Abrir navegador teste",
  "keyword": "Dado "
});
formatter.match({
  "location": "steps.Tela_inicialSteps.abrir_navegador_teste()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validar inserção do look no carrinho de compras",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "como comprador quero buscar um look \"Faded Short Sleeve\" no sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "steps.Tela_inicialSteps.como_comprador_quero_buscar_um_look_no_sistema(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adiciono no carrinho de compras",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.Tela_inicialSteps.adiciono_no_carrinho_de_compras()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preciso verificar se o look \"Faded Short Sleeve T-shirts\" \"$16.51\" encontra-se no carrinho de compras",
  "keyword": "Entao "
});
formatter.match({
  "location": "steps.Tela_inicialSteps.verificar_se_o_look_está_no_carrinho_de_compras(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});