package DesenvolvimentoAvancadoEmJava.Modulo1.Exemplos;

public class FuncaoComClasseAnonima {
    public static void main (String [] args) {
        Funcao colocarPrefixoSenhorNaString = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. " + valor;
            }
        };
        System.out.println(colocarPrefixoSenhorNaString.gerar("Joao"));
    }
}
