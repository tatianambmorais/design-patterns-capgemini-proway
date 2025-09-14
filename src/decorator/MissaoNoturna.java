package decorator;

public class MissaoNoturna extends MissaoDecorator {
    public MissaoNoturna(Missao missao){
        super(missao);
    }

    @Override
    public String getDescricao(){
        return missao.getDescricao() + " noturna";
    }

    public double getRecompensa(){
        return missao.getRecompensa() * 1.10;
    }
}
