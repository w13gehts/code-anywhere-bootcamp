package DesenvolvimentoAvancadoEmJava.Modulo2.Exemplos;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes2 {
    public static void main (String [] args) {
        String [] nomes = {"Joao", "Paulo", "Oliveira", "Santos", "Instrutor","Java"};
        Integer [] numeros = {1, 2, 3, 4, 5};
        imprimirTodosNomes(nomes);
        imprimirODobroDeCadaItemDaLista(numeros);

        //Stream em contexto de lista
        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Tester");
        profissoes.add("Gerente de Projeto");
        profissoes.add("Gerente de Qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);

    }
    public static void imprimirTodosNomes (String... nomes) {
        //impresso pelo for
        for (String nome : nomes) {
            System.out.println("Imprimido pelo for: " + nome);
        }

        //impresso pelo forEach
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimido pelo forEach: " + nome));
    }

    public static void imprimirODobroDeCadaItemDaLista (Integer... numeros) {
        //impresso pelo for
        for (Integer numero : numeros) {
            System.out.println("Imprimido pelo for: " + numero * 2);
        }

        //impresso pelo forEach
        Stream.of(numeros)
                .forEach(numero -> System.out.println("Imprimido pelo forEach: " + numero * 2));

        //impresso pelo Map ForEach
        Stream.of(numeros).map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
