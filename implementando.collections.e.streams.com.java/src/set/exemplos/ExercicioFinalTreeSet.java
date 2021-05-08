package set.exemplos;

import java.util.TreeSet;

public class ExercicioFinalTreeSet {
    public static void main(String[] args) {

        //crie um TreeSet e execute as seguintes operações:
        TreeSet<Integer> numeros = new TreeSet<>();

        //adicione 5 números inteiros: 3, 88, 20, 44, 3
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //navegue no TreeSet exibindo cada número no console
        System.out.println(numeros);

        //remova o primeiro item do Set
        System.out.println("-> " + numeros.pollFirst());

        //adicione um novo número no Set: 23
        numeros.add(23);
        System.out.println(numeros);

        //verifique o tamanho do TreeSet
        System.out.println(numeros.size());

        //Verifique se o TreeSet está vazio
        System.out.println(numeros.isEmpty());
    }
}
