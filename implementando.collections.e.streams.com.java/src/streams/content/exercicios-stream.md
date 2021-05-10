## Exercícios - Streams

1) Considere a java.util.List de frutas conforme: ["Maçã", "Laranja", "Banana", "Limão"] Qual o estado resultante da chamada: "frutas.stream().noneMatch(fruta -> fruta.length() >= 10)"?

```
a) ( ) Erro de compilação
b) ( ) Um novo Stream com os elementos que atendem a condição parametrizada
c) (x) true
d) ( ) Erro de execução
e) ( ) false
```

2) Considere a java.util.List de frutas conforme: ["Maçã", "Laranja", "Banana", "Limão"] Qual o estado resultante da chamada: "frutas.stream().collect(Collectors.groupingBy(fruta -> fruta.substring(0, 1))"

```
a) ( ) []
b) ( ) Erro de compilação
c) ( )  ["Maçã", "Laranja", "Banana", "Limão"]
d) ( ) Erro de execução
e) (x) {M=["Maçã"], L=["Laranja", "Limão"], B=["Banana"]}
```

3) Considere a java.util.List de frutas conforme: ["Maçã", "Laranja", "Banana", "Limão"] Qual o estado resultante da chamada: "frutas.stream().min(Comparator.comparingInt(String::length))"

```
a) ( ) Banana
b) ( ) Laranja
c) ( ) Limão
d) (x) Maçã
e) ( ) Erro de compilação, método "min" não existe
```

4) Considere a java.util.List de frutas conforme: ["Maçã", "Laranja", "Banana", "Limão"] Qual o estado resultante da chamada: "frutas.stream().anyMatch(fruta -> fruta.contains("X"))"?

```
a) (x) false
b) ( ) true
c) ( ) Erro de compilação, nenhuma fruta tem a letra "X"
d) ( ) Erro de compilação, método "anyMatch" não existe
e) ( ) Erro de execução, nenhuma fruta tem a letra "X"
```

5) Considere a java.util.List de frutas conforme: ["Maçã", "Laranja", "Banana", "Limão"] Qual o estado resultante da chamada: "frutas.stream().max(Comparator.comparingInt(String::length))"?

```
a) ( ) Maçã
b) ( ) Erro de compilação, método "max" não existe
c) ( ) Laranja
d) ( ) Limão
e) ( ) Banana
```

6) Considere a java.util.List de frutas conforme: ["Maçã", "Laranja", "Banana", "Limão"] Qual o estado resultante da chamada: "frutas.stream().filter(fruta -> fruta.length() > 5 ).collect(Collectors.toList())"?

```
a) ( ) Erro de compilação, método "filter" não existe
b) ( ) ["Laranja", "Banana", "Limão"]
c) ( ) ["Maçã", "Laranja", "Banana", "Limão"]
d) (x) ["Laranja", "Banana"]
e) ( ) Erro de execução
```

7) Considere a java.util.List de frutas conforme: ["Maçã", "Laranja", "Banana", "Limão"] Qual o estado resultante da chamada: "frutas.stream().count()"?

```
a) ( ) Um número de tipo int com valor 4
b) ( ) Um número de tipo double com valor 4
c) ( ) Um número de tipo float com valor 4
d) (x) Um número de tipo long com valor 4
e) ( ) Um número de tipo long com valor 5
```

8) Assinale a alternativa correta:

```
a) (x) O método "peek" retorna o mesmo Stream de entrada
b) ( ) O método "forEach" retorna um único elemento
c) ( ) O método "peek" retorna void
d) ( ) O método "peek" lança NoSuchElementException se a entrada for nula
e) ( ) O método "forEach" retorna um objeto de mesmo tipo do objeto de entrada
```

9) Considere a java.util.List de frutas conforme: ["Maçã", "Laranja", "Banana", "Limão"] Qual o estado resultante da chamada: "frutas.stream().min(Comparator.comparingInt(String::length))"

```
a) ( ) Limão
b) ( ) Banana
c) ( ) Laranja
d) (x) Maçã
e) ( ) Erro de compilação, método "min" não existe
```

10) Considere a java.util.List de frutas conforme: ["Maçã", "Laranja", "Banana", "Limão"] Qual o estado resultante da chamada: "frutas.stream().map(fruta -> fruta + " - " + (fruta.length() * 2).collect(Collectors.toList())"?

```
a) (x) ["Maçã - 8", "Laranja - 14", "Banana - 6", "Limão - 10"]
b) ( ) Erro de execução
c) ( )  ["Maçã - 4", "Laranja - 7", "Banana - 6", "Limão - 5"]
d) ( ) ["Maçã - 0", "Laranja - 0", "Banana - 0", "Limão - 0"]
e) ( ) Erro de compilação, método "map" não existe
```

11) Assinale a alternativa correta:

```
a) ( ) A Stream API não é performática
a) ( ) A Stream API é performática pois executa as operações de forma síncrona
a) ( ) A Stream API é performática pois usa algoritmos de inteligência artificial
a) ( ) A Stream API não deve ser utilizada para grandes coleções
a) (x) A Stream API é performática pois executa as operações de forma paralelizada

```

