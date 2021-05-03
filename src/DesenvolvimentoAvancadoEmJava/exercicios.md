## Exercícios - Paradigma Funcional no Java

1) É aquele que expressa o código através de comandos ao computador, nele é possível ter controle de estado dos objetos. De acordo com a afirmação, qual alternativa representa esse paradigma?
```
     a) ( ) Declarativo
     b) ( ) Imutabilidade
     c) ( ) Funcional
     d) ( ) Recursividade
     e) (x) Imperativo 
```

2) Damos uma regra, uma declaração de como queremos que o programa se comporte. De acordo com a afirmação, qual alternativa representa esse paradigma?

```
a) ( ) Composição de Funções
b) ( ) Imutabilidade
c) (x) Funcional
d) ( ) Recursividade
e) ( ) Imperativo 
```

3) Uma vez que uma variável recebe um valor, esta vai possuir esse valor para sempre ou quando criamos um objeto ele não pode ser modificado. De acordo com a afirmação, qual alternativa representa esse paradigma?

```
a) ( ) Composição de Funções
b) (x) Imutabilidade
c) ( ) Funcional
d) ( ) Recursividade
e) ( ) Imperativo 
```

## Exercícios - Lambda

1) Qual é a sintaxe base de uma lambda?

```
a) ( ) Tipo nomeVariavel = parametro -> logica
b) ( ) Tipo nomeVariavel = valor;
c) ( ) TipoAbstrato nomeVariavel = valor
d) (x) InterfaceFuncional nomeVariavel = parametro -> logica
e) ( ) TipoEnum nomeVariavel = parametro -> logica
```

2) Quando devemos utilizar as chaves em uma lambda?

```
a) ( ) Quando o mesmo possui apenas uma instrução
b) ( ) Quando utilizamos a referência do método
c) ( ) Quando utilizamos a interface Runnable
d) (x) Quando o mesmo posusi mais de uma instrução
e) ( ) Quando o mesmo não possui nenhuma instrução
```

3) Qual das alternativas a seguir é uma declaração de uma lambda?

```
a) ( ) Funcao a = "2";
b) ( ) Funcao a => "2";
c) ( ) Funcao a = a => "2";
d) ( ) Funcao a -> "2";
e) (x) Funcao a = valor -> "2";
```

4) Antes do Java 8 qual era a estratégia utilizada para implementação de interface em uma classe específica?

```
a) (x) Classe Anônima
b) ( ) Declaração de uma outra interface 
c) ( ) Enum
d) ( ) Classe Abstrata
e) ( ) Encapsulamento 
```

## Exercícios - Recursividade

1) Qual o problema que pode ocorrer ao utilizar a recursividade?

```
a) ( ) Deadlock
b) ( ) Starvation
c) ( ) Concorrência
d) (x) Estouro de Pilha (StackOverFlow)
e) ( ) Erro de compilação
```

2) É uma técnica de otimização que consiste no cache do resultado de uma função baseada nos parâmetros de entrada. A partir dessa afirmação, julgue o item correto.

 ```
 a) (x) Memoization
 b) ( ) Tail Call 
 c) ( ) Lambda
 d) ( ) Paradigma Imperativo
 e) ( ) Imutabilidade
 ```

3) É uma recursão onde não há nenhuma linha de código após a chamada do próprio método e, sendo assim, não há nenhum tipo de processamento a ser feito após a chamada recursiva. A partir dessa afirmação, julgue o item correto.

```
a) ( ) Memoization
b) (x) Tail Call
c) ( ) Lambda
d) ( ) Paradigma Imperativo
e) ( ) Imutabilidade
```

## Exercícios - Processamento Assíncrono e Paralelo

1) Assinale a alternativa que corresponde com a seguinte afirmação: “São todos os processamentos que ocorrem em sequência”.

```
a) ( ) Processamento assíncrono
b) (x) Processamento síncrono
c) ( ) Processamento paralelo
d) ( ) Processamento concorrente
e) ( ) Nenhuma das alternativas
```

2) Assinale a alternativa que apresenta a forma correta de ter acesso a um parallel stream?

```
a) (x) list().stream().parallel() //ArrayList
b) ( ) list().parallel() //ArrayList
c) ( ) new Parallel()
d) ( ) list().stream().parallelStream() //ArrayList
e) ( ) Nenhuma das alternativas
```

3) O que é uma Thread?

```
a) ( ) Um programa
b) ( ) Nenhuma das alternativas
c) ( ) Uma função do sistema operacional
d) (x) É um pequeno programa que trabalha como um subsistema
e) ( ) Um método de uma classe Java
```

4) Qual o nome do método para executar uma thread (API ANTIGA)?

```
a) ( ) execute()
b) ( ) wait()
c) (x) start()
d) ( ) run()
e) ( ) Nenhuma das alternativas
```

5) Qual o nome do método para saber se uma thread está dormindo/em repouso (API ANTIGA)?

```
a) ( ) execute()
b) ( ) isAlive()
c) ( ) Nenhuma das alternativas
d) (x) sleep()
e) ( ) wait()
```

6) Qual o nome do método para saber se uma thread está em execução (API ANTIGA)?

```
a) ( ) sleep()
b) ( ) wait()
c) (x) isAlive()
d) ( ) execute()
e) ( ) Nenhuma das alternativas
```

7) Qual o nome da interface que deve ser implementada para a thread conseguir executá-la (API ANTIGA)?

```
a) ( ) Runnable
b) ( ) Function
c) ( ) List
d) ( ) Callable
e) ( ) Nenhuma das alternativas
```

8) Qual é o método que consegue saber se uma execução já foi finalizada dentro da interface Future (NOVA API)?

```
a) ( ) Nenhuma das alternativas
b) (x) isDone()
c) ( ) get()
d) ( ) isCanceled()
e) ( ) cancel()
```

9) Qual a nova interface que foi incluída no pacote java.util.concurrent para uma thread conseguir executá-la (NOVA API)?

```
a) ( ) List
b) ( ) Function
c) ( ) Runnable
d) ( ) Nenhuma das alternativas
e) (x) Callable
```

10) Qual a implementação padrão da interface Future (NOVA API)?

```
a) ( ) CompletableFuture
b) (x) FutureTask
c) ( ) Thread
d) ( ) CopyOnWriteArrayList
e) ( ) Nenhuma das alternativas
```

