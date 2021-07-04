#language: pt

@tag
Funcionalidade: Validar inserção do look no carrinho de compras

      Contexto: Abrir sistema
      Dado Abrir navegador teste
 			
 			
 			Esquema do Cenário: Validar inserção do look no carrinho de compras
      Dado como comprador quero buscar um look <Look> no sistema 
      Quando adiciono no carrinho de compras
      Entao preciso verificar se o look <produto> <preço_esperado> encontra-se no carrinho de compras
    
Exemplos:
| Look                 | produto                      |  preço_esperado|
| "Faded Short Sleeve" | "Faded Short Sleeve T-shirts"|"$16.51"        |


