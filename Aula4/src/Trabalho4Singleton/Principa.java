package Trabalho4Singleton;

public class Principa {

      public  static void main(String[] args){

            ArquivoSingleton arq1 = ArquivoSingleton.getInstancia();

            arq1.gravaArquivo(" Linha 1 - Gerado pela executor 1");
            arq1.gravaArquivo(" Linha 2 - Gerado pela executor 1");
            System.out.printf("Arquivo atualizado");

            ArquivoSingleton arq2 = ArquivoSingleton.getInstancia();

            arq2.gravaArquivo("Linha 3 - Gerado pelo executor 2");
            arq2.gravaArquivo("Linha 4- Gerado pelo executor 2");
            System.out.printf("Arquivo atualizado");
        }

}
