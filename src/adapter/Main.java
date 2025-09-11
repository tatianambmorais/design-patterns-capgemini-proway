package adapter;

import adapter.impressorasDiferentes.ImpressoraAdapter;
import adapter.impressorasDiferentes.ImpressoraAntiga;
import adapter.impressorasDiferentes.NovaImpressora;
import adapter.leitorDeCartoes.CartaoAdapter;
import adapter.leitorDeCartoes.LeitorCartaoAntigo;
import adapter.leitorDeCartoes.LeitorCartaoChip;
import adapter.tomadasEadaptadores.SecadorAmericano;
import adapter.tomadasEadaptadores.TomadaAdapter;
import adapter.tomadasEadaptadores.TomadaBrasileira;

public class Main {
    public static void main (String[] args){
        // 1 - Adaptador de tomada
//        SecadorAmericano secador = new SecadorAmericano();
//        TomadaBrasileira tomada = new TomadaAdapter(secador);
//
//        tomada.ligarNaTomada();

        // 2 - Adaptador de impressora

//        ImpressoraAntiga impressoraAntiga = new ImpressoraAntiga();
//        NovaImpressora novaImpressora = new ImpressoraAdapter(impressoraAntiga);
//        novaImpressora.imprimirDocumento("Relatório de vendas");

        // Leitor de cartões
//
//        LeitorCartaoAntigo leitorCartaoAntigo = new LeitorCartaoAntigo();
//        LeitorCartaoChip leitorCartaoChip = new CartaoAdapter(leitorCartaoAntigo);
//        leitorCartaoChip.lerChip("123456789");
    }
}
