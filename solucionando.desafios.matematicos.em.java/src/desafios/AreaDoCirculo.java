package desafio1;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //declare suas variaveis do tipo double
        double raio = scan.nextDouble();

        //continue a soluçao
        double area = 3.14159 * (Math.pow(raio, 2));
        System.out.printf("A=%.4f\n", area);
    }
}