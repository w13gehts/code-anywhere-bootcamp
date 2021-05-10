## Exercícios - Comparators

1) Dado o ArrayList de estudantes: [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}], responda: Após implementar Comparable na classe Estudante, qual o estado resultante após a ordenação com base na regra 'other.idade - this.idade'?

```
a) ( ) Erro de execução ou compilação
b) ( ) [{nome="Joice", idade=15}, {nome="Talison", idade=19}, {nome="Matheus", idade=22}, {nome="Carla", idade=65}]
c) ( ) [ ]
d) (x) [{nome="Carla", idade=65}, {nome="Matheus", idade=22}, {nome="Talison", idade=19}, {nome="Joice", idade=15}]
e) ( ) [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}]
```

2) Dado o ArrayList de estudantes: [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}], responda: Referente ao método "Collection.sort()" assinale a alternativa correta:

```
a) (x) Este método não existe
b) ( ) Recebe uma instância de Collection e retorna na ordem natural do objeto
c) ( ) Recebe uma instância de List com tipo genérico em Comparable, e retorna na ordem definida pela implementação de compareTo
d) ( ) Recebe uma instância de Collection com tipo genérico em Comparable, e retorna na ordem definida pela implementação de compareTo
e) ( ) Recebe uma instância de Collection com tipo genérico em Comparator, e retorna na ordem definida pela implementação de compareTo
```

3) Dado o ArrayList de estudantes: [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}], responda: Referente ao método "Comparator.compare", assinale a alternativa incorreta:

```
a) (x) Recebe dois argumentos genéricos e retorna um inteiro
b) ( ) Recebe dois argumentos genéricos e retorna o maior objeto
c) ( ) Recebe dois argumentos genéricos e retorna o menor objeto
d) ( ) Recebe um argumento genéricos e retorna um inteiro
e) ( ) Este método não existe
```

4) Dado o ArrayList de estudantes: [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}], responda: Não é uma chamada válida para o método 'estudantes.sort':

```
a) ( ) estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed())
b) ( ) estudantes.sort((first, second) -> first.getIdade() - second.getIdade())
c) (x) estudantes.sort((first, second) -> first.getIdade() - second.getIdade()).reversed()
d) ( ) estudantes.sort((first, second) -> second.getIdade() - first.getIdade())
e) ( ) estudantes.sort(Comparator.comparingInt(Estudante::getIdade))
```

5) Dado o ArrayList de estudantes: [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}], responda: Após implementar Comparable na classe Estudante, qual o estado resultante após a ordenação com base na regra 'this.idade - other.idade'?

```
a) ( ) [{nome="Carla", idade=65}, {nome="Matheus", idade=22}, {nome="Talison", idade=19}, {nome="Joice", idade=15}]
b) (x) [{nome="Joice", idade=15}, {nome="Talison", idade=19}, {nome="Matheus", idade=22}, {nome="Carla", idade=65}]
c) ( ) Erro de execução ou compilação
d) ( ) [ ]
e) ( ) [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}]
```

6) Dado o ArrayList de estudantes: [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}], responda: Referente ao método "Comparable.compareTo", assinale a alternativa correta:

```
a) ( ) Este método não existe
b) ( ) Recebe um argumento genérico, e retorna um número decimal. Se positivo, o objeto atual (this) será antes que o objeto de comparação. Se negativo, o objeto atual (this) será depois do objeto de comparação. Se zero, os objetos invertem a ordem de inserção
c) ( ) Recebe um argumento genérico, e retorna um número inteiro. Se positivo, o objeto atual (this) será depois que o objeto de comparação. Se negativo, o objeto atual (this) será antes do objeto de comparação. Se zero, os objetos invertem a ordem de inserção
d) ( ) Recebe um argumento genérico, e retorna um número inteiro. Se positivo, o objeto atual (this) será depois que o objeto de comparação. Se negativo, o objeto atual (this) será antes do objeto de comparação. Se zero, os objetos na ordem de inserção
e) (x) Recebe um argumento genérico, e retorna um número inteiro. Se positivo, o objeto atual (this) será antes que o objeto de comparação. Se negativo, o objeto atual (this) será depois do objeto de comparação. Se zero, os objetos permanecem na ordem de inserção
```

7) Assinale a alternativa com código que compila:

```
a) (x) Collections.sort(List.of(1, 5, 0, 9, 12, 23));
b) ( ) Collections.sort(Map.of("one", 1, "five", 5, "zero", 0, "nine", 9, "twelve", 12, "twenty-three", 23));
c) ( )  Collections.sort(Set.of(1, 5, 0, 9, 12, 23), new SetComparator());
d) ( ) Collections.sort(Set.of(1, 5, 0, 9, 12, 23), new MapComparator());
e) ( ) Collections.sort(Set.of(1, 5, 0, 9, 12, 23));
```

8) Dado o ArrayList de estudantes: [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}], responda: Assinale a alternativa correta:

```
a) ( ) Nenhuma das alternativas está correta.
b) (x) O método Collections.sort() é sobrecarregado, pode receber tanto uma lista de tipo genérico que estenda Comparable, como também uma lista comum sendo que o segundo parâmetro é uma implementação de Comparable
c) ( ) O método Collections.sort() sempre requer um argumento com uma lista de tipo genérico que estenda Comparable
d) ( ) O método Collections.sort(estudantes) não requer um argumento com uma lista de tipo genérico que estenda Comparable
```

9) Dado o ArrayList de estudantes: [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}], responda: Referente ao método "Comparator.reversed", assinale a alternativa correta:

```
a) ( ) Recebe como argumento um objeto do tipo Comparator que compara objetos na ordem inversa ao objeto atual (this)
b) ( ) Não recebe parâmetros, retorna um inteiro para a ordem do objeto atual na ordem reversa com base no Comparator da instância atual (this)
c) ( ) Este método não existe
d) (x) Não recebe parâmetros, retorna um comparator na ordem reversa com base no Comparator da instância atual (this)
e) ( ) Não recebe parâmetros, retorna a lista em ordem reversa com base no Comparator da instância atual (this)
```

10) Dado o ArrayList de estudantes: [{nome="Matheus", idade=22}, {nome="Carla", idade=65}, {nome="Joice", idade=15}, {nome="Talison", idade=19}], responda: Assinale a alternativa correta:

```
a) ( ) java.util.Comparator deve ser usada na implementação da classe de domínio pois recebe dois argumentos como parâmetro do método 'compareTo'
b) ( ) java.util.Comparable não deve ser usada na implementação da classe de domínio pois recebe dois argumentos como parâmetro do método 'compareTo'
c) (x) java.util.Comparable deve ser usada na implementação da classe de domínio pois recebe apenas um argumento como parâmetro do método 'compareTo' 
d) ( ) java.util.Comparator deve ser usada na implementação de uma classe de negócio pois recebe apenas um argumento como parâmetro do método 'compareTo'
e) ( ) java.util.Comparable deve ser usada na implementação da classe de domínio pois recebe dois argumentos como parâmetro do método 'compareTo'
```

