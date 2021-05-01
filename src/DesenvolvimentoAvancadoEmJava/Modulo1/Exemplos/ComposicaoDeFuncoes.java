package DesenvolvimentoAvancadoEmJava.Modulo1.Exemplos;
import java.util.Arrays;

/*Paradigma Funcional no Java:
  Composicao de funcoes e criar uma nova funcao atraves da composicao de outras.
  Por ex, vamos criar uma funcao que vai filtrar um array, filtrando somente os numeros pares e multiplicando por 2 */

public class ComposicaoDeFuncoes {
    public static void main (String [] args) {
        int [] valores = {1, 2, 3, 4};

    //funcional
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map (numero -> numero * 2)
                .forEach (numero -> System.out.println(numero));

    //imperativo
        for (int i = 0; i < valores.length; i++) {
            int valor = 0;

            if (valores [i] % 2 == 0) {
                valor = valores[i] * 2;
                if (valor != 0) {
                    System.out.println(valor);
                }
            }
        }
    }
}

