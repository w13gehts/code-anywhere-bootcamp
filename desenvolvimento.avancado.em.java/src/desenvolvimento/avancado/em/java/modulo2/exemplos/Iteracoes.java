package desenvolvimento.avancado.em.java.modulo2.exemplos;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main (String [] args) {
        String [] nomes = {"Joao", "Paulo", "Oliveira", "Santos", "Instrutor","Java"};
        Integer [] numeros = {1, 2, 3, 4, 5};
        imprimirNomesFiltrados(nomes);
    }

    public static void imprimirNomesFiltrados (String... nomes) {
        String nomesParaImprimir="";

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Joao")) {
                nomesParaImprimir+=" "+nomes[i];
            }
        }
        System.out.println("Nomes do for: " + nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Joao"))
                .collect(Collectors.joining());
        System.out.println("Nomes do Stream: " + nomesParaImprimirDaStream);
    }
}
