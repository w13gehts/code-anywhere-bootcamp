package desafios;

import java.util.Scanner;

public class CombustivelViagem {
    public static void main(String[] args) {

        //continue a solucao
        Scanner scan = new Scanner(System.in);

        int tempo = scan.nextInt();
        int distancia = scan.nextInt();

        System.out.printf("%.3f\n", (tempo  * distancia)/12.0);
    }
}
