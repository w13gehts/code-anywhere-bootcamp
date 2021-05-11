package desafios;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumero {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        //declare suas variaveis corretamente
        int  par = 0;
        int  impar = 0;
        int  positivo = 0;
        int  negativo = 0;
        int  entrada;

        //continue a solução
        while (leitor.hasNextInt()) {
            entrada = leitor.nextInt();
            if (entrada % 2 == 0) par++;
            if (Math.abs(entrada % 2) == 1) impar++;
            if (entrada > 0) positivo++;
            if (entrada < 0) negativo++;
        }

        //insira suas variaveis corretamente
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
