package desafios;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Multiplos {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int A = leitor.nextInt();
        int B = leitor.nextInt();

        if (A%B == 0 || B%A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao Sao Multiplos");
        }
    }
}
