package adapter.tomadasEadaptadores;

public class TomadaAdapter implements TomadaBrasileira{
    SecadorAmericano secadorAmericano;

    public TomadaAdapter(SecadorAmericano secadorAmericano){
        this.secadorAmericano = secadorAmericano;
    }

    @Override
    public void ligarNaTomada(){
        System.out.println("Usando adaptador para ligar secador americano na tomada brasileira");
        secadorAmericano.plugInFlatPlug();
    }
}
