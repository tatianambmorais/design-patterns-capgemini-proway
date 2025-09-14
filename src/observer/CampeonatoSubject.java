package observer;

public interface CampeonatoSubject {
    void adicionarTime(Observer time);
    void removerTime(Observer time);
    void notificarTimes(String mensagem);
}
