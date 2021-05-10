package streams.exemplos;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioFinal {
    public static void main(String[] args) {
        // utilizando uma lista com um objeto complexo (Estudante, por exemplo) realize as seguintes operações:
        List<EstudanteEF> estudantes = new ArrayList<>();

        // transforme cada estudante em uma string com os atributos do objeto
        estudantes.add(new EstudanteEF("Ashley", 18));
        estudantes.add(new EstudanteEF("Nicole", 21));
        estudantes.add(new EstudanteEF("Nauan", 23));
        estudantes.add(new EstudanteEF("Cyro", 16));
        estudantes.add(new EstudanteEF("Juliana", 27));
        estudantes.add(new EstudanteEF("Luiz", 24));
        estudantes.add(new EstudanteEF("Bruno", 35));
        System.out.println(estudantes);

        //conte a quantidade de estudantes que tem na coleção
       System.out.println("Contagem: " + estudantes.stream().count());

        //filtre estudantes com idade igual ou superior a 18 anos
        System.out.println("Estudantes com 18 anos ou mais: "
        + estudantes.stream().filter((estudante) -> estudante.getIdade() >= 18)
        .collect(Collectors.toList())
        );

        //exiba cada elemento no console
        System.out.println(estudantes);

        //retorne estudantes com nome que possui a letra B
        System.out.println("Estudantes que possuem a letra B no nome: " + estudantes.stream()
                .filter((estudante) -> estudante.getNome().toLowerCase().contains("b"))
                .collect(Collectors.toList())
        );

        //retorne se existe ao menos um estudante com a letra D no nome
        System.out.println("Algum elemento possui a letra D no nome? " + estudantes.stream()
                .anyMatch((elemento) -> elemento.getNome().contains("d"))
        );

        //retorne o estudante mais velho da coleção
        System.out.println("Estudante mais velho: " + estudantes.stream().max(Comparator.comparingInt(EstudanteEF::getIdade)).get());

        //retorne o estudante mais novo da coleção
        System.out.println("Estudante mais novo: " + estudantes.stream().min(Comparator.comparingInt(EstudanteEF::getIdade)).get());
    }
}
