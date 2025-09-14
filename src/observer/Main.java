package observer;
public class Main {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();

        Time timeA = new Time("Leões");
        Time timeB = new Time("Tigres");
        Time timeC = new Time("Águias");

        campeonato.adicionarTime(timeA);
        campeonato.adicionarTime(timeB);

        campeonato.marcarPartida("Leões vs Tigres - Sábado às 16h");
        campeonato.publicarResultado("Leões 2 x 1 Tigres");

        campeonato.removerTime(timeB);
        campeonato.adicionarTime(timeC);

        campeonato.marcarPartida("Leões vs Águias - Domingo às 14h");
    }
}
