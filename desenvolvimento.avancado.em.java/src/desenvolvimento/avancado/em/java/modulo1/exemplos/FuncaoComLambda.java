package desenvolvimento.avancado.em.java.modulo1.exemplos;

public class FuncaoComLambda {
    public static void main (String [] args) {
        Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar ("Joao"));
    }
}


