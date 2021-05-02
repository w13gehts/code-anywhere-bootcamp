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

```
public class Consumidores {
    public static void main (String [] args) {
        Consumer<String> imprimirUmaFrase = System.out::println;
        imprimirUmaFrase.accept("Hello World");
    }
}
```

```
public class Consumidores {
    public static void main (String [] args) {
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }
}
```

#### Predicados

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

```
public class Fornecedores {
    public static void main (String [] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        System.out.println(instanciaPessoa.get());
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

