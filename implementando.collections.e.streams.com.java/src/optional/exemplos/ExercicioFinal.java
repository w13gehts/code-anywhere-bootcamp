package optional.exemplos;

import java.util.Optional;

public class ExercicioFinal {
    public static void main(String[] args) {
        // crie um optional de um determinado tipo de dado
        Optional<String> optionalExercicio = Optional.of("optional está presente");

        // crie com estado vazio, estado presente e com null
        Optional<String> optionalEmpty = Optional.empty();
        Optional<String> optionalPresente = Optional.of("Estado Presente");
        Optional<String> optionalNull = Optional.ofNullable(null);

        //se presente, exiba o valor no console
        optionalPresente.ifPresent(System.out::println);

        // se vazio, exiba "Optional vazio" no console
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));

        //se presente, transforme o valor e exiba no console
        optionalPresente.ifPresent(System.out::println);

        //se presente, pegue o valor do optional e atribua em uma variável
        if (optionalPresente.isPresent()) {
            String valor = optionalPresente.get();
            System.out.println(valor);
        }

        //se presente, filtre o optional com uma determinada regra de negócio
        optionalPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));

        //se vazio, lance uma exceção IlegalStateException
        optionalNull.map((valor) -> valor.concat(" *** ")).ifPresent(System.out::println);
        optionalNull.orElseThrow(IllegalStateException::new);
    }
}
