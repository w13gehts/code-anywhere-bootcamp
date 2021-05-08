package set.exemplos;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //adiciona os numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //remove o numero do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        //navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println("--> " + numero);
        }

        //retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
