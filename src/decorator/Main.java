package decorator;

public class Main {
    public static void main(String[] args){
        Missao missao = new MissaoImpl("Matar o T-rex", 1000);

        Missao missao1 = new MissaoNoturna(missao);
        Missao missao2 = new MissaoHardCore(missao);
        Missao missao3 = new MissaoTempoLimitado(missao);


        System.out.println("Descrição: " + missao1.getDescricao());
        System.out.println("Recompensa: " + missao1.getRecompensa());
        System.out.println("Descrição: " + missao2.getDescricao());
        System.out.println("Recompensa: " + missao2.getRecompensa());
        System.out.println("Descrição: " + missao3.getDescricao());
        System.out.println("Recompensa: " + missao3.getRecompensa());




    }
}
