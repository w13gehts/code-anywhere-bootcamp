package desenvolvimento.basico.em.java.desafios.par;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class isPair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0 ; i <= n; i++) {
            if (i % 2 == 0 && i > 0 ) System.out.println(i);
        }
    }
}
