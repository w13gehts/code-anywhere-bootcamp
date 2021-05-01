package DesenvolvimentoAvancadoEmJava.Modulo1.Exemplos;
import java.util.function.UnaryOperator;

/*Imutabilidade:
  Significa que uma vez que uma variavel recebeu um valor, vai possuir esse valor para sempre, ou quando criamos
  um objeto ele nao pode ser modificado.*/

public class Imutabilidade {
    public static void main (String [] args) {
        int valor = 20;
        UnaryOperator<Integer> retornarDobro = v -> v * 2;

        //retorna o dobro do valor
        System.out.println(retornarDobro.apply(valor));

        //valor nao sera alterado
        System.out.println(valor);
    }
}
