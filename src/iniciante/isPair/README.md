## Desafios

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

## Entrada

Você receberá 1 valor inteiro **N**, onde **N > 0**.

## Saída

Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

 

| Exemplo de Entrada | Exemplo de Saída |
| ------------------ | ---------------- |
| 6                  | 2                |
|                    | 4                |
|                    | 6                |

## Informações

Todas as entradas e saída dos algoritmos são utilizados o STDIN e STDOUT de cada linguagem, abaixo tem algumas dicas de como utilizar cada STDIN e STDOUT de cada linguagem.

**JavaScript**

Em JavaScript as funções de STDIN e STDOUT respectivamente são **gets** e **console.log**, a função gets é implementada internamente para auxiliar a entrada dos dados.

**Exemplo:**

```
// Retorna a próxima linha de entrada
let line = gets(); 

// Imprime o dado
console.log(line); 
```



------

**Java**

Em Java existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar **BufferedReader** para o STDIN e o **System.out.println** para o STDOUT.

**Exemplo:**

```
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// Lê a linha de entrada
StringTokenizer st = new StringTokenizer(br.readLine()); 

int a = Integer.parseInt(st.nextToken());

// Imprime o dado
System.out.println(a); 
```



------

**Python**

Em Python existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar **sys.stdin.readline** para o STDIN e o **print** para o STDOUT.

**Exemplo:**

```
import sys

// Lê a linha de entrada
a = int(sys.stdin.readline()) 

// Imprime o dado
print(a); 
```