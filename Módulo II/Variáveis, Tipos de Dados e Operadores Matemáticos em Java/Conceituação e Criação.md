#Variáveis, Tipos de Dados e Operadores matemáticos em Java

## Conceituação 

Variável: "Um espaço na memória do computador, onde se pode guardar valores."

4 tipos:
Instância: Objetos;
Classe: classe;
local: Dentro de métodos;
Parâmetro: Na assinatura do método.

## Criação 

Padrão de definição:

<?visibilidade?><?modificador?>tipo nome <?valorInicial?>
* Os valores entre "?" são os opcionais

Visibilidade:"public", "protected" e "private" -> Estão ligadas a orientação a objeto
Modificador: "static" e "final"  -> Estão ligadas a orientação a objeto; O final define uma variável como constante, que o valor não irá mudar.
Tipo: Tipo de dado. Deverá ser sempre definido, pois o Java é uma linguagem fortemente tipada.
Nome: Nome que é fornecido a variável -> Nome para definir para o que ela serve.
Valor inicial: um valor inicial, caso deseje.

### Regras de Criação:

* Não deve iniciar com números;
* Embora permitido, não é recomendável usar "$" e "_";
* Case Sensitive (Diferencia maiusculas e minusculas)
* Sem espaço;
* Não pode usar palavras reservadas.

### Boas Práticas

* Sempre começar com minúsculas;
* Nomes expressivos;
* Notação Camelo (Cada palavra, com exceção da primeira, deverá começar por maiúscula. Ex: int quantidadeProduto);
* Quando constante(final), maiúscula e separada por "_" (Ex: final QUANTIDADE_PRODUTO).

