package adapter.leitorDeCartoes;

public class CartaoAdapter implements LeitorCartaoChip{
    public LeitorCartaoAntigo leitorCartaoAntigo;

    public CartaoAdapter(LeitorCartaoAntigo leitorCartaoAntigo){
        this.leitorCartaoAntigo = leitorCartaoAntigo;
    }

    @Override
    public void lerChip(String dadosChip){
        System.out.println("Lendo dados chip no cartão antigo");
        leitorCartaoAntigo.lerTarjaMagnética(dadosChip);
    }
}
