package factory.carroFactory;

public class MotoEletrica implements VeiculoEletrico{
    @Override
    public void carregar(){
        System.out.println("Carregando moto elétrica...");
    }
}
