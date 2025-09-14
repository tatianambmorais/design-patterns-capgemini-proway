package composite;

import composite.organizacaoExercito.Batalhao;
import composite.organizacaoExercito.Esquadrao;
import composite.organizacaoExercito.Soldado;
import composite.sistemaDeArquivos.Arquivo;
import composite.sistemaDeArquivos.Pasta;

public class Main {
        public static void main(String[] args) {
                // Exercicio 1 - Arquivos
//            Arquivo foto = new Arquivo("foto.jpg");
//            Arquivo texto = new Arquivo("texto.txt");
//
//            Pasta documentos = new Pasta("Documentos");
//            documentos.adicionar(foto);
//            documentos.adicionar(texto);
//
//            Pasta raiz = new Pasta("Raiz");
//            raiz.adicionar(documentos);
//            raiz.adicionar(new Arquivo("leia-me.md"));
//
//            raiz.exibir();
//        }

//            Exercicio 2 - Exército
                Soldado s1 = new Soldado(10);
                Soldado s2 = new Soldado(15);
                Soldado s3 = new Soldado(20);

                System.out.println("Poder do soldado 1: " + s1.mostrarPoder());
                System.out.println("Poder do soldado 2: " + s2.mostrarPoder());
                System.out.println("Poder do soldado 3: " + s3.mostrarPoder());

                Esquadrao esquadrao1 = new Esquadrao();
                esquadrao1.adicionarUnidade(s1);
                esquadrao1.adicionarUnidade(s2);

                System.out.println("Poder do esquadrão 1: " + esquadrao1.mostrarPoder());

                Esquadrao esquadrao2 = new Esquadrao();
                esquadrao2.adicionarUnidade(s3);
                System.out.println("Poder do esquadrão 2:  " + esquadrao2.mostrarPoder());

                Batalhao batalhao = new Batalhao();
                batalhao.adicionarUnidade(esquadrao1);
                batalhao.adicionarUnidade(esquadrao2);
                System.out.println("Poder do batalhão:" + batalhao.mostrarPoder());
        }
}
