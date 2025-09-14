package decorator;

public class MissaoHardCore extends  MissaoDecorator{
    public MissaoHardCore(Missao missao){
        super(missao);
    }

    @Override
    public String getDescricao(){
        return missao.getDescricao() + " hardcore";
    }

    @Override
    public double getRecompensa(){
        return missao.getRecompensa() * 1.50;
    }
}
