package composite;

public class Main {
    public static void main(String[] args){

            Arquivo foto = new Arquivo("foto.jpg");
            Arquivo texto = new Arquivo("texto.txt");

            Pasta documentos = new Pasta("Documentos");
            documentos.adicionar(foto);
            documentos.adicionar(texto);

            Pasta raiz = new Pasta("Raiz");
            raiz.adicionar(documentos);
            raiz.adicionar(new Arquivo("leia-me.md"));

            raiz.exibir();
        }


}
