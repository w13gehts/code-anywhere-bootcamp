package comparators.exercicioFinal;
import java.util.Comparator;

public class MusicaOrdemReversaComparator implements Comparator<Musica> {
    @Override
    public int compare(Musica o1, Musica o2) {
        return o2.getNumeroTrack() - o1.getNumeroTrack();
    }
}
