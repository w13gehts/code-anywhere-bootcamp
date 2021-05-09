package comparators.exercicioFinal;

public class Musica implements Comparable<Musica> {

    private final String nomeMusica;
    private final String nomeCantor;
    private final Integer numeroTrack;

    public Musica (String nomeMusica, String nomeCantor, Integer numeroTrack) {
        this.nomeMusica = nomeMusica;
        this.nomeCantor = nomeCantor;
        this.numeroTrack = numeroTrack;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public String getNomeCantor() {
        return nomeCantor;
    }

    public Integer getNumeroTrack() {
        return numeroTrack;
    }

    @Override
    public String toString() {
        return numeroTrack + ") " +nomeMusica + " - " + nomeCantor;
    }

    @Override
    public int compareTo (Musica o) {
        return this.getNumeroTrack() - o.getNumeroTrack();
    }
}
