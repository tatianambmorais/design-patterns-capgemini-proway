package composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ItemSistema{
    private String name;
    private List<ItemSistema> itens = new ArrayList<>();
    public Pasta(String name){
        this.name = name;
    }


    public void adicionar(ItemSistema item) {
        itens.add(item);
    }


    @Override
    public void exibir() {
        System.out.println("Pasta: " + name);
        for (ItemSistema item : itens) {
            item.exibir();
        }
    }

}
