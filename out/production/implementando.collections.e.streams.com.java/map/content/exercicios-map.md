1) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Qual o estado resultante da chamada 'capitais.put("AM", "Manaus")'?

```
a) ( ) null
b) ( ) [{AM=Manaus}]
c) ( ) Erro de compilação
d) (x) [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}, {AM=Manaus}]
e) ( ) Erro de execução
```

2) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Qual o estado resultante da chamada 'capitais.get(3)'?

```
a) ( ) Erro de execução - NullPointerException
b) (x) Erro de compilação
c) ( ) {RJ=Rio de Janeiro}
d) ( ) {TO=Palmas}
e) ( ) Erro de execução - ArrayIndexOutOfBoundsException

```

3) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Qual o estado resultante da chamada 'capitais.put(null, "São Paulo")' e depois 'capitais.put(null, "Florianópolis")'?

```
a) (x) [{null=Florianópolis}, {RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}]
b) ( ) [{RS=Porto Alegre}, {null=Florianópolis}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}]
c) ( ) [{null=Florianópolis}, {null=São Paulo}, {RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}]
d) ( ) [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}, {null=Florianópolis}]
e) ( ) Erro de execução ou compilação
```

4) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Qual o estado resultante da chamada 'capitais.set("RJ", "Búzios")'?

```
a) ( ) Erro de execução
b) ( ) [{RJ=Búzios}, {RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}]
c) (x) Erro de compilação
d) ( ) [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Búzios}]
e) ( ) [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}, {RJ=Búzios}]
```

5) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Qual o estado resultante da chamada 'capitais.get("SC")'?

```
a) ( ) Erro de execução - NullPointerException
b) ( ) Erro de compilação
c) ( ) {}
d) ( ) Erro de execução - ArrayIndexOutOfBoundsException
e) (x) null
```

6) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Qual o estado resultante da chamada 'capitais.put("GO", null)' e depois 'capitais.put("RO", null)'?

```
a) ( ) [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}, {GO=null}]
b) ( ) Erro de execução - NullPointerException
c) (x) [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}, {GO=null}, {RO=null}]
d) ( ) [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}, {RO=null}]
e) ( ) Erro de compilação
```

7) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Qual o estado resultante da chamada 'capitais.get("Rio de Janeiro")'?

```
a) ( ) {}
b) ( ) Erro de compilação
c) ( ) {RJ=Rio de Janeiro}
d) ( ) Erro de execução
e) (x) null
```

8) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Qual o estado resultante da chamada 'capitais.put("RS", "Gravataí")'?

```
a) (x) [{RS=Gravataí}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}]
b) ( ) Erro de execução ou compilação
c) ( ) [{RS=Gravataí}, {RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}]
d) ( ) [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}, {RS=Gravataí}]
e) ( ) [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}, {RS=Gravataí}]
```

9) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Assinale a alternativa incorreta:

```
a) ( ) capitais.keySet() - retorna um java.util.Set com as chaves do mapa
b) ( ) capitais.entrySet() - retorna um java.util.Set com as entradas (chave e valor) do mapa
c) ( ) capitais.containsKey("SC") retorna se a chave "SC" existe no mapa
d) (x) capitais.clear() é um método de Collection, como Map não estende a interface java.util.Collection, ele não existe na java.util.Map
e) ( ) capitais.containsValue("Florianópolis") retorna se o valor "Florianópolis" existe no mapa
```

10) Dado o HashMap de capitais de estado: [{RS=Porto Alegre}, {PB=João Pessoa}, {TO=Palmas}, {RJ=Rio de Janeiro}], responda: Assinale a alternativa correta:

```
a) (x) Para o mapa apresentado, a chamada de 'capitais.containsValue("Porto Alegre")' retornará true pois o valor "Porto Alegre" está no mapa
b) ( ) Para o mapa apresentado, a chamada de 'capitais.containsValue("Rio de Janeiro")' retornará true pois a chave "RJ" está no mapa
c) ( ) Para o mapa apresentado, a chamada de 'capitais.containsKey("ES")' retornará true pois a chave "ES" não está no mapa
d) ( ) Para o mapa apresentado, a chamada de 'capitais.containsValue("Mato Grosso")' retornará false pois a chave "Mato Grosso" está no mapa
e) ( ) Para o mapa apresentado, a chamada de 'capitais.containsKey("MG")' retornará true pois a chave "MG" está no mapa
```

