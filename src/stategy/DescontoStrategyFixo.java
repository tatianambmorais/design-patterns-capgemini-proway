package stategy;

import java.util.List;

public class DescontoStrategyFixo implements DescontoStrategy {

    @Override
    public double calcularDesconto(List<Item> itens) {
        return 50.0;
    }

}
