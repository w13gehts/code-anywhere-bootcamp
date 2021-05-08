package set.exemplos;

import java.util.HashSet;
import java.util.Set;

public class ExercicioFinalHashSet {
    public static void main(String[] args) {

        //crie um Set e execute as seguintes operações:
        Set<Integer> numeros = new HashSet<>();

        //adicione 5 números inteiros: 3, 88, 20, 44, 3
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //navegue no Set exibindo cada número no console
        System.out.println(numeros);

        //remova o primeiro item do Set
        numeros.remove(3);
        System.out.println(numeros);

        //adicione um novo número no Set: 23
        numeros.add(23);
        System.out.println(numeros);

        //verifique o tamanho do Set
        System.out.println(numeros.size());

        //Verifique se o Set está vazio
        System.out.println(numeros.isEmpty());
    }
}
