package factory.documentoFactory;

public class NotaFiscal implements DocumentoDigital{
    @Override
    public void assinar(){
        System.out.println("Nota fiscal assinada digitalmente");
    }
}
