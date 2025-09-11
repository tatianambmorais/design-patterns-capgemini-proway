package adapter.impressorasDiferentes;

public class ImpressoraAdapter implements NovaImpressora{
    ImpressoraAntiga impressoraAntiga;

    public ImpressoraAdapter(ImpressoraAntiga impressoraAntiga){
        this.impressoraAntiga = impressoraAntiga;
    }

    @Override
    public void imprimirDocumento(String doc){
        System.out.println("Usando adaptador para imprimir na impressora antiga");
        impressoraAntiga.printar(doc);

    }
}
