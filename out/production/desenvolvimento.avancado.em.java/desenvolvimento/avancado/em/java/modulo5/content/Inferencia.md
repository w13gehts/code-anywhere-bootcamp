## Inferencia

O suporte do Java desenvolveu a palavra `var` para substituir quando já sabemos qual é a instância, mas não se pode utilizar em todos os casos. O  `var`  é utilizado somente para variáveis locais. O  `var` sempre terá de estar dentro de um escopo: for, while, try, do corpo de um método. 

`var` não pode ser utilizado a nível de classe, não pode ser utilizado como parâmetro. Exemplo:

``` 
public static void testar (var nome) {
	System.out.println(nome)
}
```

`var` funciona dentro do corpo do método. Exemplo:

```
public static void testar(String nome, String sobrenome) {
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }
```

`var` não pode ser utilizada em variáveis locais não inicializadas. Exemplo:

```
public static void printarSoma2 (int... numeros) {
        var soma;

        if (numeros.length > 0) {
            soma = 0;
            for (int numero: numeros) {
                soma += numero;
            }
            System.out.println("A soma é: " + soma);
        }
    }
}
```

Dentro de um `for` podemos usar a inferencia no tipo de `var`. Exemplo:

```
public static void printarSoma2 (int... numeros) {
        int soma;

        if (numeros.length > 0) {
            soma = 0;
              for (int numero: numeros) {
                soma += numero;
            }            
            System.out.println("A soma é: " + soma);
        }
    }
```

`for` iterativo:

```
public static void printarSoma3 (int... numeros) {
        int soma;

        if (numeros.length > 0) {
            soma = 0;            

            for (var numero = 0; numero < numeros.length; numero++) {
                soma += numeros[numero];
            }
            System.out.println("A soma é: " + soma);
        }
    }
```

Pode-se utilizar dentro de um `try with resource`. Exemplo:

```
//obs: má prática o try dentro de outro try, utilizado somente para exemplo

private static void connectAndPrintURLJavaOracle() {
        try {
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();

            try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            }
        } catch (Exception e){
                e.printStackTrace();
            }
        }
```

### Resumo

##### Conseguimos usar `var`:

-  Variáveis locais inicializadas
- Variáveis suporte do enhanced for
- Dentro de um for iterativo
- Variável try with resource

##### Não conseguimos usar `var`:

- Em nível de classe
- Como parâmetro
- Variáveis locais não inicializadas

