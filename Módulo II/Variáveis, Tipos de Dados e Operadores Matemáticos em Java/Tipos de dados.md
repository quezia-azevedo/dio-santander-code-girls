## Conteituação

"São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente."

### Tipificação: 

Estática(Forte): Quando uma linguagem obriga você a tipificar a variável durante a criação. Ex: Java.
Dinâmica (Fraco): Durante a execução da variável, ele irá assumir ou identificar o tipo dela. Ex: Javascript.

Primitivo: Tipos de dados mais básicos, atômicos e homogênicos.
Composto: Ligado a orientação à objetos.

## Tipos de dados:

Textual:
char: caracteres de 16-bit -> char c = 'T';
string: (é uma classe/objeto, n é primitivo) - string s = "T";


Numeral:
*byte: -128 até 127 -> byte b = 15;
*short: -32.768 até 32.767 -> short s = -15785;
*int:  -2.127.483.648 até 2.127.483.647 -> int i = 8515785;
long: Inteiro de 64bits -> long l = 5938515785L;
float:  numero reais e fracionados de 32bita -> float f = 3.14.. (f),
double: numero fracionais de 64bits -> double d = 3.14.. (d);
--é necessário definir f ou d no final de float ou double para indicar.

Lógico:
boolean: true e false -> boolean s = false;

Objeto:
[Será explorado mais pra frente...]

##utilização:
*São estabelecidos caso a gente não estabeleça um valor prévio para eles.
Valores defalt de:

byte, short, int: 0;
long: 0L;
float, double: 0.0f | 0.0d;
char: '\u0000';
String(e objetos): null;
boolean: false.

## Boas Práticas:

- Usar de forma adequada cada tipo de dado para cada informação.
