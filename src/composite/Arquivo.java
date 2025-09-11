package composite;

public class Arquivo implements ItemSistema {
    private String name;
    public Arquivo(String name){
        this.name = name;
    }

    @Override
    public void exibir(){
        System.out.println("Exibindo arquivo de nome: "+ name);

    }
}
