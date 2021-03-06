package desenvolvimento.avancado.em.java.modulo2.exemplos;
import java.util.function.Consumer;

public class Consumidores {
    public static void main (String [] args) {
        Consumer<String> imprimirUmaFrase = System.out::println;
        imprimirUmaFrase.accept("Hello ");

        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase2.accept("Hello World");
    }
}
