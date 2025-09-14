package stategy;

public class Main {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(new Item("Camisa", 100));
        carrinho.adicionarItem(new Item("Calça", 150));

        carrinho.setDescontoStrategy(new DescontoStrategyPercentual());
        carrinho.mostrarResumo();
        carrinho.setDescontoStrategy(new DescontoStrategyFixo());

        carrinho.mostrarResumo();
        carrinho.setDescontoStrategy(new DescontoStrategyProgressivo());
        carrinho.mostrarResumo();
    }

}
