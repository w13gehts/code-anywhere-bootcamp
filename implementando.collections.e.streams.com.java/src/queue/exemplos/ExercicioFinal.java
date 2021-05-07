package queue.exemplos;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFinal {
    public static void main(String[] args) {
        /*Crie uma fila e execute as seguintes operações*/

        //adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        Queue<String> filaExercicio = new LinkedList<>();

        filaExercicio.add("Juliana");
        filaExercicio.add("Pedro");
        filaExercicio.add("Carlos");
        filaExercicio.add("Larissa");
        filaExercicio.add("João");

        //navegue na fila exibindo cada nome no console
        System.out.println("Os nomes na fila são: " + filaExercicio);

        //retorne o primeiro item da fila, sem remove-lo
        String primeiroDaFila = filaExercicio.poll();
        System.out.println("O primeiro item da fila é: " + primeiroDaFila);

        //retorne o primeiro item da fila, removendo o mesmo
        primeiroDaFila = filaExercicio.remove();
        System.out.println("O próximo item da fila é: " + primeiroDaFila);

        //adicione um novo nome: Daniel
        filaExercicio.add("Daniel");
        System.out.println("O nome Daniel foi adicionado à fila: " + filaExercicio);

        //verifique a posiçao que o mesmo assumiu na fila
        System.out.println("A posição de Daniel na fila é: " + (filaExercicio.size() - 1));

        //retorne o tamanho da lista
        System.out.println("O tamanho da fila é: " + filaExercicio.size());

        //verifique se a lista está vazia
        System.out.println("A fila está vazia? " + filaExercicio.isEmpty());

        //verifique se o nome Carlos está na lista
        boolean temCarlos = filaExercicio.contains("Carlos");
        System.out.println("O nome Carlos está na fila? " + temCarlos);
    }
}
