## Lambda no Java

Os lambdas obedecem o conceito do paradigma funcional, com podemos facilitar alegibilidade do nosso código. Além disso, com a nova API Funcional do Java, podemos ter uma alta produtividade para lidar com objetos. Primeiramente, devemos entender o que são interfaces funcionais.

#### Interfaces Funcionais

São interfaces que possuem apenas um método abstrato. Exemplo:

```
public interface Funcao {
	String gerar (String valor);
}
```

Geralmente, as interfaces funcionais possuem uma anotação em nível de classe (@FunctionalInterface), para forçar o compilador a apontar um erro se a interface não estiver de acordo com as regras de uma interface funcional. Esta anotação não é obrigatória, pois o compilador consegue reconhecer uma interface em tempo de compilação.

Antes do Java 8, se quiséssemos implementar um comportamento específico para uma única classe deveríamos utilizar uma classe anônima para implementar esse comportamento.

``` 
public static void main (String [] args) {
	Funcao colocarPrefixoSenhorNaString = new Funcao() {
		@override
		public String gerar(String valor) {
			return "Sr. " + valor;
		}
	};
	System.out.println(colocarPrefixoSenhorNaString.gerar("Joao"));
}

@FunctionalInterface
interface Funcao {
	String gerar (String valor);
}
```

Agora que sabemos como se define uma interface funcional, podemos aprender como se define uma lambda. 

#### Estrutura de uma lambda

```
InterfaceFuncional nomeVariavel = parametro -> logica
```

Para entender melhor, utilizaremos o exemplo da Função.

Vimos que a sintaxe fica bastante verborosa e o código fica bastante confuso utilizando esta implementação, agora escreveremos exatamente o mesmo código utilizando o lambda da interface Função.

```
class FuncaoComLambda {
	public static void main (String [] args) {
		Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
		System.out.println(colocarPrefixoSenhorNaString.gerar("Joao"));
	}
}

@FunctionalInterface
interface Funcao {
	String gerar (String valor);
}
	
```

#### Atenção

Quando uma lambda possui apenas uma instrução no corpo de sua lógica não é necessário o uso de chaves. Exemplo:

``` 
Funcao colocarPrefiroSenhorNaString = valor -> "Sr. " + valor;
```

 Se a função possui mais de uma instrução devemos utilizar chaves e além disso, deve-se explicitar o retorno se o retorno for diferente de void. Exemplo:

```
Funcao colocarPrefiroSenhorNaString = valor -> {
String valorComPrefixo = "Sr. " + valor;
String valorComPrefixoEPontoFinal = valorComPrefixo+".";
return valorComPrefixoEPontoFinal;
} 
```

