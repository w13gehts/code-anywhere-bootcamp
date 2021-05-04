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

## Exercícios - Modularização do Java

1) Criado um modulo com o nome “test.java” e dentro dele existe o pacote “java.test”. Considerando que quero exportar esse pacote apenas para o módulo “runner.java”, qual a linha de comando correspondente às informações?

```
a) ( ) requires digital.innovation.one.utils to digital.innovation.one.core;
b) (x) exports java.test to runner.java;
c) ( ) exports digital.innovation.one.utils to digital.innovation.one.core;
d) ( ) requires java.test to runner.java;
e) ( ) Nenhuma das alternativas
```

2) O “Compact Profile” foi desenvolvido em qual versão do Java?

```
a) ( ) JDK 12
b) ( ) JDK 11
c) ( ) JDK 9
d) (x) JDK 8
e) ( ) Nenhuma das alternativas
```

3) A seguir todos os módulos estão importados no módulo java.base, exceto:

```
(x) java.sql
java.io
java.lang
java.utils
Nenhuma das alternativas
```

4) São benefícios da modularização...

```
a) ( ) Utilizar ou importar métodos estáticos utilizando o import static
b) ( ) Lambdas
c) ( ) Acoplar a tecnologia da JDK
d) (x) Melhorar a organização e desempenho
e) ( ) Nenhuma das alternativas
```

5) Qual a palavra chave utilizada para importar um módulo:

```
a) ( ) import
b) ( ) add
c) (x) requires
d) ( ) install
e) ( ) Nenhuma das alternativas
```

6) No arquivo de gerenciamento de dependências do module qual a palavra chave utilizada para declarar o módulo?

```
a) ( ) static
b) ( ) declare
c) (x) module
d) ( ) public
e) ( ) Nenhuma das alternativas
```

7) Qual o nome do arquivo que gerencia as dependências do módulo?

```
a) ( ) settings.gradle
b) ( ) application.yml
c) ( ) pom.xml
d) (x) module-info.java
e) ( ) Nenhuma das alternativas
```

8) Em qual versão foi lançada a modularização no Java?

```
a) ( ) JDK 12
b) ( ) JDK 11
c) (x) JDK 9
d) ( ) JDK 1
e) ( ) Nenhuma das alternativas
```

9) Qual a palavra chave utilizada para importar exportar um pacote do módulo?

```
a) ( ) share
b) ( ) extract
c) ( ) extends
d) (x) exports
e) ( ) Nenhuma das alternativas
```

10) A partir de qual versão começou o plano de modularizar a plataforma Java?

```
a) ( ) JDK 3
b) (x) JDK 7
c) ( ) JDK 8
d) ( ) JDK 1
e) ( ) Nenhuma das alternativas
```

## Exercícios - Novidades no Java 10

1) O que irá acontecer no código a seguir?

`private static void connectAndPrintURLJavaOracle()  {` 
       `try {` 
            `var url = new URL("https://docs.oracle.com/javase/10/language/");` 
            `var urlConnection = url.openConnection();` 

`try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){` 
            `System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));` 
        `}` 
    `} catch (Exception e) {` 
        `e.printStackTrace();` 
    `}` 
`}`

```
a) ( ) Erro na linha 3, var é só para String
b) (x) Funcionará sem problemas
c) ( ) Erro na linha 6, var só pode ser utilizado no primeiro try
d) ( ) Erro na linha 6, não se pode usar var dentro de um try sem resource
e) ( ) Nenhuma das alternativas
```

2) No comando “docker container run -it -m512M --entrypoint bash openjdk:10-jdk”, o que o “-m512M” significa?

```
a) ( ) Memória livre do container
b) ( ) Memória inicial do container
c) ( ) Memória mínima do container
d) (x) Memória limite do container
e) ( ) Nenhuma das alternativas
```

3) O que irá acontecer no código a seguir? 

`var nome;` 
`System.out.println(nome);`

```
a) ( ) Imprimirá null
b) (x) Erro de compilação, pois o var tinha que ser inicializado
c) ( ) Erro de compilação, pois não é "var", é "val"
d) ( ) Imprimirá um valor vazio
e) ( ) Nenhuma das alternativas
```

4) O que irá acontecer no código a seguir? 

`Public void printHelloTimes(int times) {` 
`var hello;` 
`hello = “Hello”;` 
`for(var i = 0; i < times ; i++){` 
 	`System.out.println(hello); }}`

```
a) ( ) Lançará uma exceção no momento que for atribuir o número 0 para o i
b) (x) Erro na linha 2, var sem ser inicializado
c) ( ) Erro na linha 4, for iterativo não pode usar var
d) ( ) Erro na linha 4, o correto é ++i
e) ( ) Nenhuma das alternativas
```

5) João criou um método e precisa saber se ele vai funcionar pois o mesmo não te um computador para testar, você como já fez o curso de Java Avançado da Digital Innovation One pode ajudá-lo, então diga a ele o que irá acontecer no código a seguir? 

`public int somarNumeros(var numero1, var numero2) { return numero1+numero2; }`

```
a) (x) Erro de compilação, não se pode utilizar var em assinatura de métodos
b) ( ) Erro de compilação pois não é "var", é "val"
c) ( ) Imprimirá um valor vazio
d) ( ) Imprimirá o nome João
e) ( ) Nenhuma das alternativas
```

6) A partir de qual versão a inferência foi introduzida na JDK?

```
a) ( ) JDK 3
b) ( ) JDK 8
c) ( ) JDK 7
d) (x) JDK 10
e) ( ) Nenhuma das alternativas
```

7) O que irá acontecer no código a seguir? 

`public class InferenciaExemplo {` 

`private var expoente = 2;`    

`public static void main(String[] args) {`        

`System.out.println(10*expoente);`   

​	`} `

`}`

```
a) ( ) Erro de compilação, pois o var só pode ser utilizado par strings
b) (x) Erro de compilação, pois var só pode ser utilizado em variáveis locais
c) ( ) Imprimirá um valor vazio
d) ( ) Imprimirá o nome João
e) ( ) Nenhuma das alternativas
```

8) O que irá acontecer no código a seguir?

`public static void printarSoma(int... numeros) {`
        `int soma;`
        `if (numeros.length > 0) {`
            `soma = 0;`
            `for (var numero = 0; numero < numeros.length; numero++) {`
                `soma += numeros[numero];`
            `}`

  `System.out.println("A soma e ::: " + soma);`
    `}`
`}`

```
a) ( ) Erro de compilação, pois var não entende tipos primitivos
b) ( ) Erro de compilação, pois var não pode ser utilizado dentro de um for iterativo
c) ( ) Irá lançar uma exceção no momento em que for atribuído 0 para i
d) (x) Funcionará sem problema algum
e) ( ) Nenhuma das alternativas
```

9) No comando “docker container run -it --cpus 2 openjdk:10-jdk” a flag “--cpus” significa:

```
a) ( ) Número de imagens Docker rodando
b) (x) Número de processadores disponíveis
c) ( ) Número de objetos java rodando
d) ( ) Número de processos rodando
e) ( ) Nenhuma das alternativas
```

10) O que irá acontecer no código a seguir (desconsiderar importações e o método main)? var nome = “Joao”; System.out.println(nome);

```
a) ( ) Erro de compilação, pois o var tinha que ser inicializado
b) ( ) Erro de compilação, pois não é "var", é "val"
c) ( ) Imprimirá um valor vazio
d) (x) Imprimirá o nome João
e) ( ) Nenhuma das alternativas
```

