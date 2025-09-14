package stategy;

import java.util.List;

public class DescontoStrategyPercentual implements DescontoStrategy {


    @Override
    public double calcularDesconto(List<Item> itens) {
        double total = itens.stream().mapToDouble(Item::getPreco).sum();
        return total * 0.10;
    }


}
