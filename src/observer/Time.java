package observer;

public class Time implements Observer {
    private String nome;

    public Time(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(String messagem){
        System.out.println("Time " + nome + "recebeu notificação: " + messagem);
    }
}
