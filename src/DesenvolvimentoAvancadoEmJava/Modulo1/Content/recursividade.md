# Recursividade

Na recursividade, uma função chama a si mesma repetidamente até atingir uma condição de parada. No caso do Java, um método chama a si mesmo passando para si objetos primitivos. Cada chamada gera uma nova entrada na pilha de execução e alguns dados podem ser disponibilizados em um escopo global ou local através de parâmetros em um escopo global ou local.

Recursividade tem um papel importante em programação funcional, facilitando que evitemos estados mutáveis e mantenhamos nosso programa mais declarativo e menos imperativo.

```
public class FatorialRecursivo {
    public static void main (String [] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial (int value) {
        if (value == 1) {
            return value;
        } else {
            return value * fatorial((value -1));
        }
    }
}
```

Explicação sobre a recursividade:

```
(fatorial(5))
(5 * (fatorial(4)))
(5 * (4 * (fatorial(3))))
(5 * (4 * (3 * (fatorial(2))))
(5 * (4 * (3 * (2 * (fatorial(1))))))
(5 * (4 * (3 * (2 * (1 * (fatorial(0)))))))
(5 * (4 * (3 * (2 * (fatorial(1))))))
(5 * (4 * (3 * (2 * (1)))))
(5 * (4 * (3 * (2))))
(5 * (4 * (6)))
(5 * (24))
120
```

#### Tail Call

Recursão em cauda é uma recursão onde não há nenhuma linha de código após a chamada do próprio método e, sendo assim, não há nenhum tipo de processamento a ser feito após a chamada recursiva.

**Obs:** A JVM não suporta a recursão em cauda, ele lança um estouro de pilha (StackOverFlow).

```
public class FatorialTailCall {
    public static void main (String [] args) {
        System.out.println(fatorialA(5));
    }

    public static double fatorialA (double valor) {
        return fatorialComTailCall (valor, 1);
    }

    public static double fatorialComTailCall(double valor, double numero) {
        if (valor == 0) {
            return numero;
        }
        return fatorialComTailCall(valor - 1, numero * valor);
    }
}
```

Explicação sobre o Tail Call:

```
FatorialA (5,1)
FatorialA (4,5)
FatorialA (320)
FatorialA (2,60)
FatorialA (1,120)
FatorialA (0,120)
120
```

#### Memoization

É uma técnica de otimização que consiste no cache do resultado de uma função, baseado nos parâmetros de entrada. Com isso, nas seguintes execuções conseguimos ter uma resposta mais rápida.

```
public class FatorialMemoization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main (String [] args) {
        long I = System.nanoTime();
        System.out.print(fatorialComMemoization(15));
        long F = System.nanoTime();
        System.out.println("Fatorial 1 " + (F-I));

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        F = System.nanoTime();
        System.out.println("Fatorial 2 " + (F-I));
    }

    public static Integer fatorialComMemoization(Integer value) {
        if (value == 1) {
            return value;
        } else {
            if (MAPA_FATORIAL.containsKey(value)) {
                return MAPA_FATORIAL.get(value);
            } else {
                Integer resultado = value * fatorialComMemoization(value -1);
                MAPA_FATORIAL.put(value, resultado);
                return resultado;
            }
        }
    }
}
```