package factory.documentoFactory;

public class Recibo implements  DocumentoDigital{
    @Override
    public void assinar(){
        System.out.println("Recibo assinado digitalmente");
    }
}
