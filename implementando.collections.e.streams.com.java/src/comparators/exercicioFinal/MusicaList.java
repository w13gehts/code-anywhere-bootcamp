package comparators.exercicioFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MusicaList {


    public static void main(String[] args) {
        //crie uma Lista de um objeto complexo e execute as seguintes operações:
        List<Musica> musicas = new ArrayList<>();

        //adicione elementos nessa lista
        musicas.add(new Musica("Daisy","Ashnikko", 1));
        musicas.add(new Musica("Toxic","Ashnikko", 2));
        musicas.add(new Musica("Deal With it","Ashnikko feat. Kelis", 3));
        musicas.add(new Musica("Slumber Party","Ashnikko feat. Princess Nokia", 4));
        musicas.add(new Musica("Drunk With My Friends","Ashnikko", 5));
        musicas.add(new Musica("Little Boy","Ashnikko", 6));
        musicas.add(new Musica("Cry","Ashnikko feat. Grimes", 7));
        musicas.add(new Musica("L8r Boi","Ashnikko", 8));
        musicas.add(new Musica("Good While It Lasted","Ashnikko", 9));
        musicas.add(new Musica("Clitoris! The Musical","Ashnikko", 10));

        //ordene implementando a interface java.util.Comparator no seu objeto complexo
        Collections.sort(musicas, new MusicaOrdemReversaComparator());
        System.out.println("--- ordem reversa soundtrack (interface comparator) ---");
        System.out.println(musicas);

        //ordene implementando um novo objeto com a interface java.util.Comparable
        Collections.sort(musicas);
        System.out.println("--- ordem natural das tracks (interface comparable) ---");
        System.out.println(musicas);

        //ordene usando uma expressão lambda na chamada de suaLista.sort()
        musicas.sort((first, second) -> first.getNumeroTrack() - second.getNumeroTrack());
        System.out.println("--- ordem natural dos números da soundtrack ---");
        System.out.println(musicas);

        //ordene usando referências de métodos e os métodos estáticos de Comparator
        musicas.sort(Comparator.comparingInt(Musica:: getNumeroTrack));
        System.out.println("--- ordem natural dos números da soundtrack (method reference) ---");
        System.out.println(musicas);

        musicas.sort(Comparator.comparingInt(Musica:: getNumeroTrack));
        System.out.println("--- ordem reversa dos números da soundtrack (method reference) ---");
        System.out.println(musicas);
    }
}
