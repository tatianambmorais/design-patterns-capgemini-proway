package factory.documentoFactory;

import javax.print.Doc;

public abstract class DocumentoDigitalFactory {
    public static DocumentoDigital escolherDocumento(String documento) {
        switch (documento) {
            case "recibo":
                return new Recibo();
            case "nota fiscal":
                return new NotaFiscal();
            case "contrato":
                return new Contrato();
            default:
                throw new IllegalArgumentException("Documento desconhecido" + documento);
        }
    }
}
