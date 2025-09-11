package factory.documentoFactory;

import javax.print.Doc;

public class Contrato implements DocumentoDigital {
    @Override
    public void assinar(){
        System.out.println("Contrato assinado digitalmente");
    }
}
