package DesenvolvimentoAvancadoEmJava.Modulo2.Exemplos;
import java.util.function.Predicate;

public class Predicados {
    public static void main(String [] args) {
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Joao"));
    }
}
