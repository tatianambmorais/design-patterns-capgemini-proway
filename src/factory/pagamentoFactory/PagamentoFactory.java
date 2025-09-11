package factory.pagamentoFactory;

public abstract class PagamentoFactory {
    public static MeioPagamento escolherFormaPagamento(String forma){
        switch(forma) {
            case "debito":
                return new CartaoDebito();
            case "credito":
                return new CartaoDebito();
            case "boleto":
                return new Boleto();
            default:
                throw new IllegalArgumentException("Forma de pagamento desconhecida: " + forma);
        }
    }
}
