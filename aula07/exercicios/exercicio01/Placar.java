package exercicios.exercicio01;

public class Placar {
    private String nomeTimeCasa, nomeTimeVisitante;
    private int golsTimeCasa, golsTimeVisitante;

    public Placar() {

        nomeTimeCasa = "Time da casa";
        nomeTimeVisitante = "Visitante";

    }

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
    }

    public String toString() {
        return nomeTimeCasa + "-" + golsTimeCasa + " X " + golsTimeVisitante + "-" + nomeTimeVisitante;
    }
}
