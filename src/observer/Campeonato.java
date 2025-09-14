package observer;

import java.util.ArrayList;
import java.util.List;

public class Campeonato implements CampeonatoSubject {
    private List<Observer> times = new ArrayList<>();

    @Override
    public void adicionarTime(Observer time){
        times.add(time);
        System.out.println(("Time aadicionado ao campeonato"));
    }

    @Override
    public void removerTime(Observer time){
        times.remove(time);
    }

    @Override
    public void notificarTimes(String mensagem){
        for (Observer time : times){
            time.atualizar(mensagem);
        }
    }
    public void marcarPartida(String detalhes) {
        notificarTimes("Partida marcada: " + detalhes);
    }

    public void publicarResultado(String resultado) {
        notificarTimes("Resultado publicado: " + resultado);
    }

}
