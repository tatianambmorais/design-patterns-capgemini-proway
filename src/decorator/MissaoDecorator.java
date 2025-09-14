package decorator;

public abstract class  MissaoDecorator implements  Missao{
    protected Missao missao;

  public MissaoDecorator(Missao missao){
      this.missao = missao;
  }

  @Override
    public String getDescricao(){
      return missao.getDescricao();
  }

  @Override
    public double getRecompensa() {
        return missao.getRecompensa();
    }

}
