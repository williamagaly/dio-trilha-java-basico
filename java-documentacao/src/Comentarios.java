public class Comentarios {
  public static void main(String[] args) {

    // Comentário de uma linha

    /*
     * Eu sou um comentário
     * que posso ser mais detahado
     * quando necessário
     */

     //O comentário com aspécto de documentação geralmente não fica dentro de um bloco de metadados. Começa com /** e termina com */
     
  }

  /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nivel de documentação
    */
    public void metodo() {
        // Código
    }

    //CRIANDO NOSSA DOCUMENTAÇÃO NO FORMATO HTML PARA DISPONIBILIZAR VIA WEB
    //No terminal execute o comando abaixo
    // javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
}
