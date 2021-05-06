package list.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioFinal {
    public static void main(String[] args) {
        /* Crie uma lista e execute as seguintes operações: */

        //Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navegue na lista exibindo cada nome no console
        System.out.println(nomes);

        //Substitua o nome Carlos por Roberto
        nomes.set(2, "Roberto");
        System.out.println(nomes);

        //Retorne o nome da posição 1
        String nome = nomes.get(1);
        System.out.println(nome);

        //Remova o nome da posição 4
        nomes.remove(4);
        System.out.println(nomes);

        //Retorne a quantidade de itens na lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        //Verifique se o nome Juliano existe na lista
        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        //Crie uma nova lista com os nomes: Ismael e Rodrigo
        List<String> novosNomes = new ArrayList<>();

        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");
        System.out.println(novosNomes);

        //Adicione todos os itens da nova lista na primeira lista criada
        nomes.addAll(novosNomes);
        System.out.println(nomes);

        //Ordene os itens da lista por ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);

        //Verifique se a lista está vazia
       boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

    }



}
