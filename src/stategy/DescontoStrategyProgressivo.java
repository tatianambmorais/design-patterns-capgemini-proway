package stategy;

import java.util.List;

public class DescontoStrategyProgressivo implements  DescontoStrategy {
        @Override
        public double calcularDesconto(List<Item> itens) {
            return itens.size() * 10.0;
        }

}
