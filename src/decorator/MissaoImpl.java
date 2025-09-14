package decorator;

public class MissaoImpl  implements Missao{
   private String descricao;
   private double recompensa;

   public MissaoImpl(String descricao, double recompensa){
       this.descricao = descricao;
       this.recompensa = recompensa;
   }

   @Override
    public String getDescricao(){
       return descricao;
   }

   @Override
    public double getRecompensa(){
       return recompensa;
   }

}
