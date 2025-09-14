package composite.organizacaoExercito;

public class Soldado implements ExercitoComposite {
    private int valorPoder;

    public Soldado(int valorPoder){
        this.valorPoder = valorPoder;
    }

   @Override
    public int mostrarPoder(){
      return valorPoder;
   }

}
