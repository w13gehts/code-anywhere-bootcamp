## Exercícios - Optional

1) Após a chamada de "Optional.empty()", assinale a alternativa correta:

```
a) (x) O estado do objeto optional é vazio
b) ( ) O estado do objeto optional é presente
c) ( ) O método "empty" não existe
d) ( ) Erro de execução
e) ( ) Erro de execução
```

2) Após a chamada de "Optional.ofNullable(null)", assinale a alternativa correta:

```
a) ( ) Erro de execução - NullPointerException
b) ( ) O método "ofNullable" não existe
c) ( ) Erro de compilação
d) ( ) O estado do objeto optional é presente
e) (x) O estado do objeto optional é vazio
```

3) Após a chamada de "Optional.ofNullable("Carla")", assinale a alternativa correta:

```
a) ( ) Erro de execução, "ofNullable" só aceita null
b) ( ) O estado do objeto optional é vazio
c) ( ) Erro de compilação, "ofNullable" não existe
d) ( ) Erro de compilação, "ofNullable" só aceita null
e) (x) O estado do objeto optional é presente
```

4) Após a chamada de "Optional.empty()", assinale a alternativa incorreta:

```
a) ( ) "emptyOptional.isPresent()" retornará "false"
b) ( ) "emptyOptional.get()" lançará uma exceção NoSuchElementException no console
c) ( ) "emptyOptional.isEmpty()" retornará "true"
d) (x) "emptyOptional.get()" lançará uma exceção NullPointerException no console
e) ( ) "emptyOptional.orElseThrow(IllegalStateException::new)" lançará uma exceção IllegalStateException no console
```

5) Assinale a alternativa correta em relação ao método "Optional.ifPresentOrElse"?

```
a) ( ) Recebe dois argumentos, o primeiro é uma implementação de "Runnable" e o segundo uma implementação de "Consumer"
b) ( ) Recebe dois argumentos, o primeiro é uma implementação de "Consumer" que será executado quando o optional estiver presente, e o segundo uma implementação de "Runnable" que será executado quando o optional estiver vazio
c) ( ) O método "ifPresentOrElse" não existe
d) ( ) Recebe dois argumentos, ambos implementações de "Consumer"
e) ( ) Recebe dois argumentos, o primeiro é uma implementação de "Consumer" que será executado quando o optional estiver vazio, e o segundo uma implementação de "Runnable" que será executado quando o optional estiver presente
```

6) Com base na chamada: Optional<String>.of("23") - assinale a alternativa correta:

```
a) ( ) Erro de compilação, método "of" não existe com tipo String
b) ( ) Erro de execução - NullPointerException
c) ( )  "optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"))" exibirá no console "23"
d) ( ) "optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"))" exibirá no console "não está presente"
e) ( ) Erro de compilação, método "ifPresentOrElse" não existe
```

7) Com base na chamada: Optional<String>.of(255) - assinale a alternativa correta:

```
a) ( ) Erro de execução - NullPointerException
b) ( ) "optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"))" exibirá no console "não está presente"
c) ( ) Erro de compilação, método "ifPresentOrElse" não existe
d) ( ) Erro de compilação, método "of" não existe com tipo Int em Optional com tipo genérico String
e) ( ) "optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"))" exibirá no console "255"
```

8) Após a chamada de "Optional.of(null)", assinale a alternativa correta:

```
a) ( ) O estado do objeto optional é presente
b) (x) Erro de execução - NullPointerException, "of" não aceita null
c) ( ) Erro de compilação, "of" não aceita null
d) ( ) O estado do objeto optional é vazio
e) ( ) Erro de execução - IllegaStateException, "of" não aceita null
```

9) Após a chamada de "OptionalDouble.of(25.5)", assinale a alternativa correta:

```
a) ( ) Erro de compilação - OptionalDouble não existe
b) ( ) Chamar o método "get()" antes de "isPresent" lançará um erro de compilação
c) ( ) Chamar o método "get()" antes de "ifPresent" lançará um erro de compilação
d) ( ) Chamar o método "orElseThrow(IllegalStateException::new" lançará uma exceção IllegalStateException
e) (x) Chamar os métodos map((valor) -> valor * 2).ifPresent(System.out::println); vai exibir 51 no console
```

10) Quais dessas opções não é uma implementação de Optional?

```
a) ( ) OptionalDouble
b) ( ) OptionalLong
c) ( ) OptionalInt
d) ( ) OptionalString
e) ( ) Optional<String>
```

