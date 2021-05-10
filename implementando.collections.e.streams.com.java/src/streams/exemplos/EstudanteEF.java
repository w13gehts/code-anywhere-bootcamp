package streams.exemplos;

import java.util.Collection;

public class EstudanteEF {

    private final String nome;
    private final Integer idade;

    public EstudanteEF (String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }
}
