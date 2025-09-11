package factory.carroFactory;

public class CarroEletrico implements VeiculoEletrico {
    @Override
    public void carregar(){
        System.out.println("Carregando carro elétrico...");
    }
}
