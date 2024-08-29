import java.util.Locale;  
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    // criando objeto Scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.err.println("Digite seu nome: ");
    String nome = scanner.next();

    System.err.println("Digite seu sobre nome: ");
    String sobreNome = scanner.next();

    System.err.println("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.err.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    //Imprimindo os dados obtidos pelo usuário

    System.out.println("Ola, me chamo " + nome + " " + sobreNome);
    System.out.println("Tenho " + idade + " anos");
    System.out.println("Minha altura é " + altura + "m");




    

  }
}
