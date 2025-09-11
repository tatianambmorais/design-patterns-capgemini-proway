package factory.pagamentoFactory;

public class Boleto implements MeioPagamento{
    @Override
    public void realizarPagamento(){
        System.out.println("Pago com boleto");
    }
}
