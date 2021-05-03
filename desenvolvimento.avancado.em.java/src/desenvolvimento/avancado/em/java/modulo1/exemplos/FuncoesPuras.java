package desenvolvimento.avancado.em.java.modulo1.exemplos;
import java.util.function.BiPredicate;

/*Funcoes Puras:
  E chamada de pura quando invocada mais de uma vez produz exatamente o mesmo resultado*/

public class FuncoesPuras {
    public static void main (String [] args) {
        BiPredicate<Integer, Integer> verificarSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMaior.test(13, 12));
        System.out.println(verificarSeEMaior.test(13, 12));
    }
}

