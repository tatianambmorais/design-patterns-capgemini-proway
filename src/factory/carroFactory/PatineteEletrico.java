package factory.carroFactory;

public class PatineteEletrico implements VeiculoEletrico{
    @Override
    public void carregar(){
        System.out.println("Carregando patinete elétrico...");
    }
}
