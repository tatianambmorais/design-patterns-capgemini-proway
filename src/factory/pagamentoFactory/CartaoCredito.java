package factory.pagamentoFactory;

public class CartaoCredito implements MeioPagamento {
    @Override
    public void realizarPagamento(){
        System.out.println("Pago com cartão de crédito");
    }
}
