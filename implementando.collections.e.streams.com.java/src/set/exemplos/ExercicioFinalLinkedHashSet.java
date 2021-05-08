package set.exemplos;

import java.util.LinkedHashSet;

public class ExercicioFinalLinkedHashSet {
    public static void main(String[] args) {

        //crie um LinkedHashSet e execute as seguintes operações:
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        //adicione 5 números inteiros: 3, 88, 20, 44, 3
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //navegue no LinkedHashSet exibindo cada número no console
        System.out.println(numeros);

        //remova o primeiro item do LinkedHashSet
        numeros.remove(3);
        System.out.println(numeros);

        //adicione um novo número no LinkedHashSet: 23
        numeros.add(23);
        System.out.println(numeros);

        //verifique o tamanho do LinkedHashSet
        System.out.println(numeros.size());

        //Verifique se o LinkedHashSet está vazio
        System.out.println(numeros.isEmpty());
    }
}
