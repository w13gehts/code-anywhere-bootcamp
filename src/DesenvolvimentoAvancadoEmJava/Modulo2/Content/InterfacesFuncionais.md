## Objetivos da Aula

1. Entender o Paradigma Funcional no Java
2. Aprender como utilizar uma lambda e API Lambda do Java

#### Funções de Alta Ordem

É uma função que retorna uma função ou que recebe uma função como parâmetro.

```
public class FuncaoAltaOrdem {
    public static void main (String [] args) {
       Calculo soma = (a, b) -> a + b;
       System.out.println(executarOperacao(soma, 1, 3));
    }
    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

interface Calculo {
    public int calcular (int a, int b);
}
```

#### Consumer

Consumer no Java é uma interface funcional que representa uma operação que aceita um único argumento de entrada e não retorna nenhum resultado. Ao contrário da maioria das outras interfaces funcionais, espera-se que o consumer opere por meio de efeitos colaterais.

```
public class Consumidores {
    public static void main (String [] args) {
    	//modo 1
        Consumer<String> imprimirUmaFrase = System.out::println;
        imprimirUmaFrase.accept("Hello World");
        
        //modo 2
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }
}
```

#### Predicados

Predicados em Java são implementados com interfaces. Predicate <T> é uma interface funcional genérica que representa uma função de argumento único que retorna um valor booleano. Ele está localizado no pacote java.util.function. Ele contém um método test (T t) que avalia o predicado no argumento fornecido.

```
public class Predicados {
    public static void main(String [] args) {
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Joao"));
    }
}

```

#### Fornecedores (Suppliers)

A Interface Supplier é uma parte do pacote java.util.function para implementar a programação funcional em Java. Ele representa uma função que não aceita nenhum argumento, mas produz um valor do tipo T.

```
package DesenvolvimentoAvancadoEmJava.Modulo2.Exemplos;
import java.util.function.Supplier;

public class Fornecedores {
    public static void main (String [] args) {
        //modo 1
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        System.out.println(instanciaPessoa.get());

		//modo 2
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessoa2.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Joao";
        idade = 23;
    }

    @Override
    public String toString() {
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}

```

#### Iterações

Um Iterator é um objeto que pode ser usado para percorrer coleções, como ArrayList e HashSet. É chamado de "iterador" porque "iterar" é o termo técnico para loop.

```
public class Iteracoes {
    public static void main (String [] args) {
        String [] nomes = {"Joao", "Paulo", "Oliveira", "Santos", "Instrutor","Java"};
        Integer [] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
    }

    public static void imprimirNomesFiltrados (String... nomes) {
        String nomesParaImprimir="";

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Joao")) {
                nomesParaImprimir+=""+nomes[i];
            }
        }
        System.out.println("Nomes do for: " + nomesParaImprimir);     
    }
}
```

```
public class Iteracoes {
    public static void main (String [] args) {
        String [] nomes = {"Joao", "Paulo", "Oliveira", "Santos", "Instrutor","Java"};
        Integer [] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
    }

    public static void imprimirNomesFiltrados (String... nomes) {
        String nomesParaImprimir="";       

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining());
        System.out.println("Nomes do Stream: " + nomesParaImprimirDaStream);
    }
}
```

```
 public static void imprimirTodosNomes (String... nomes) {
        //impresso pelo for
        for (String nome : nomes) {
            System.out.println("Imprimido pelo for: " + nome);
        }
        
        //impresso pelo foreach
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach: " + nome));
    }
```

