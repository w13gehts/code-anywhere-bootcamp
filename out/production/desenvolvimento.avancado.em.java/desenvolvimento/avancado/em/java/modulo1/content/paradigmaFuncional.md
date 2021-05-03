## Objetivos da Aula

1. Entender o Paradigma Funcional no Java
2. Aprender como utilizar uma Lambda e API Lambda do Java
3. Entender paradigma da recursividade (Tail Call Optimization e Memorization)

#### Requisitos Básicos

- Conceitos básicos de Java
- Orientação a objeto
- Java Generics
- Collections: List e Set

## Paradigma Funcional no Java

Programação funcional é o processo de construir software através de composição de funções puras, evitando compartilhamento de estados, dados mutáveis e efeitos colaterais. É declarativa ao invés de imperativa, essa é uma definição de Eric Elliott.

#### Imperativo x Declarativo

É muito comum aprender a programar de forma imperativa, onde mandamos alguém fazer algo. Busque o usuário 15 no banco de dados. Valide essas informações do usuário.

Na programação funcional tentamos programar de forma declarativa, onde declaramos o que desejamos, sem explicar como será feito. Qual o usuário 15? Quais os erros dessas informações?

#### Paradigma Imperativo

É aquele que expressa o código através de comandos ao computador, nele é possível ter controle de estado dos objetos.

```
class Imperativo {
	public static void main (String [] args) {
		int valor = 10;
		int resultado = valor * 3;
		System.out.println("O resultado é: " + resultado);
	}
}
```

#### Paradigma Funcional

Damos uma regra, uma declaração de como queremos que o programa se comporte.

```
class Funcional {
	public static void main (String [] args) {
		UnaryOperator<Integer> calcularValorVezes3 = valor -> valor * 3;
		
		int valor = 10;
		System.out.println("O resultado é: " + calcularValorVezes3.apply(10));
	}
}
```

