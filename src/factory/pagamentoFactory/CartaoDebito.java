package factory.pagamentoFactory;

public class CartaoDebito implements MeioPagamento {
    @Override
    public void realizarPagamento(){
        System.out.println("Pago com cartão de débito");
    }
}
