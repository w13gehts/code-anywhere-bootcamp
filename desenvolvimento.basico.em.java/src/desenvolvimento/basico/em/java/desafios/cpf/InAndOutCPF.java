package desenvolvimento.basico.em.java.desafios.cpf;

import java.util.Locale;
import java.util.Scanner;

public class InAndOutCPF {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);
        String[] cpf = new String[4];
        cpf = sc.nextLine().split("\\.|-");

        for(int i = 0; i < 4; i++)
            System.out.printf("%s\n",cpf[i]);
        sc.close();
    }
}