package desenvolvimento.avancado.em.java.modulo2.exemplos;
import java.util.function.Supplier;

public class Fornecedores {
    public static void main (String [] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        System.out.println(instanciaPessoa.get());

        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessoa2.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Joao";
        idade = 23;
    }

    @Override
    public String toString() {
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
