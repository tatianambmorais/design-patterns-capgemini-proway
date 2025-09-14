package decorator;

public class MissaoTempoLimitado extends MissaoDecorator {
    public MissaoTempoLimitado(Missao missao){
        super(missao);
    }

    @Override
    public String getDescricao(){
        return  missao.getDescricao() + " com tempo limitado";
    }

    @Override
    public double getRecompensa(){
        return missao.getRecompensa() * 1.20;
    }

}
