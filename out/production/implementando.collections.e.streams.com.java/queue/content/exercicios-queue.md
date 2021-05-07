1) Dado o LinkedList de nomes: ["Matheus", "Raphael", "Lucas", "Juliana"], responda: Quais desses princípios é o correto para o conceito de fila?

```
a) ( ) Último que entra, último que sai
b) ( ) Primeiro que entra, segundo que sai
c) (x) Primeiro que entra, primeiro que sai
d) ( ) Último que entra, segundo que sai
e) ( ) Primeiro que entra, último que sai
```

2) Assinale a afirmação incorreta:

```
a) ( ) A interface java.util.Queue deve ser utilizada em situações onde a ordem de entrada e saída do elemento importa
b) ( ) A interface java.util.Deque herda métodos da interface java.util.Queue
c) ( ) A interface java.util.Queue herda métodos da interface java.util.Collection
d) (x) A interface java.util.Queue implementa o conceito de pilha, primeiro elemento que entra último elemento que sai
e) ( ) A classe java.util.LinkedList herda métodos das interfaces java.util.Queue e java.util.List
```

3) Dada uma fila vazia, qual o resultado da chamada do método 'filaVazia.poll()'?

```
a) ( ) Retorna o primeiro elemento da fila.
b) ( ) Erro de execução NoSuchElementException
c) ( ) -1
d) ( ) Erro de execução ArrayIndexOutOfBoundsException
e) (x) null
```

4) Dado o LinkedList de nomes: ["Matheus", "Raphael", "Lucas", "Juliana"], responda: Qual o estado resultante da fila após a chamada do método 'nomes.poll()'?

```
a) ( ) []
b) ( ) null
c) ( ) ["Matheus", "Lucas", "Juliana"]
d) ( ) ["Matheus", "Raphael", "Lucas"]
e) (x) ["Raphael", "Lucas", "Juliana"]
```

5) Qual o resultado da chamada 'Collections.sort()' para uma instância de 'java.util.Queue' com tipo genérico em 'java.lang.String'?

```
a) ( ) Erro de execução NullPointerException
b) ( ) Retornará a fila da mesma forma, sem alteração na ordem
c) ( ) Erro de execução ArrayIndexOutOfBoundsException
d) (x) Erro de compilação
e) ( ) Ordenará a fila por ordem alfabética
```

6) Dado o LinkedList de nomes: ["Matheus", "Raphael", "Lucas", "Juliana"], responda: Qual o estado resultante da fila após a chamada do método 'nomes.add("Carlos")'?

```
a) ( ) ["Carlos", "Matheus", "Raphael", "Lucas", "Juliana"]
b) (x) ["Matheus", "Raphael", "Lucas", "Juliana", "Carlos"]
c) ( ) Erro de compilação
d) ( ) Erro de execução - NoSuchElementException
e) ( ) []
```

7) Dado o LinkedList de nomes: ["Matheus", "Raphael", "Lucas", "Juliana"], responda: Qual destes métodos deve-se utilizar para retornar o primeiro da fila removendo-o?

```
a) ( ) get()
b) ( ) remove()
c) ( ) getAndRemove()
d) (x) poll()
e) ( ) peek()
```

8) Quais desses métodos existe na interface java.util.List, mas não na java.util.Queue?

```
a) (x) set()
b) ( ) peek()
c) ( ) remove()
d) ( ) poll()
e) ( ) add()
```

9) Dada uma fila vazia, qual o resultado da chamada do método 'filaVazia.element()'?

```
a) ( ) -1
b) ( ) Retorna o primeiro elemento da fila
c) ( ) null
d) ( ) Erro de execução ArrayIndexOutOfBoundsException
e) (x) Erro de execução NoSuchElementException
```

10) Qual o estado resultante da fila após a chamada do método 'nomes.peek()'?

```
a) ( ) ["Matheus"]
b) ( ) []
c) ( ) null
d) ( ) ["Raphael", "Lucas", "Juliana"]
e) (x) ["Matheus", "Raphael", "Lucas", "Juliana"]
```

