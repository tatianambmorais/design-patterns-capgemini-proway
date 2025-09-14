package stategy;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> itens = new ArrayList<>();
    private DescontoStrategy descontoStrategy;

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void setDescontoStrategy(DescontoStrategy strategy) {
        this.descontoStrategy = strategy;
    }

    public double calcularTotalComDesconto() {
        double total = itens.stream().mapToDouble(Item::getPreco).sum();
        double desconto = descontoStrategy != null ? descontoStrategy.calcularDesconto(itens) : 0;
        return total - desconto;
    }

    public void mostrarResumo() {
        System.out.println("Itens no carrinho:");
        for (Item item : itens) {
            System.out.println("- " + item.getNome() + ": R$" + item.getPreco());
        }
        System.out.println("Total com desconto: R$" + calcularTotalComDesconto());
    }

}
