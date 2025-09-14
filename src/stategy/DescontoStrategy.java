package stategy;

import java.util.List;

public interface DescontoStrategy {
    double calcularDesconto(List<Item> itens);
}
