public class Operadores {

    public static void main(String[] args) {

        // OPERADORES DE ATRIBUIÇÃO
        int idade = 1;
        String nome = "William";
        char genero = 'M';
        double peso = 75.8;
        boolean doadorOrgao = false;

        System.out.println("Operador de Atribuição (int): " + idade);
        System.out.println("Operador de Atribuição (String): " + nome);
        System.out.println("Operador de Atribuição (double): " + peso);
        System.out.println("Operador de Atribuição (char): " + genero);
        System.out.println("Operador de Atribuição (boolean): " + doadorOrgao);

        // OPERADORES ARITMÉTICOS
        int soma = 1 + 2;
        int subtracao = 1 - 2;
        int multiplicacao = 1 * 2;
        int divisao = 1 / 2;
        int modulo = 1 % 2;
        double resultadoAritmetico = (10 * 7) + (20 / 4);
        String nomeCompleto = "William" + " " + "Santos";

        System.out.println("Operador de Soma: " + soma);
        System.out.println("Operador de Subtração: " + subtracao);
        System.out.println("Operador de Multiplicação: " + multiplicacao);
        System.out.println("Operador de Divisão: " + divisao);
        System.out.println("Operador de Módulo: " + modulo);
        System.out.println("Operador de Precedência: " + resultadoAritmetico);
        System.out.println("Operador de Concatenação: " + nomeCompleto);

        // OPERADORES UNÁRIOS
        int numero = 5;
        numero = -numero;
        System.out.println("Operador Unário de Negativo: " + numero);
        numero = numero * -1;
        System.out.println("Operador Unário de Positivo: " + numero);
        numero = 5;
        numero++;
        System.out.println("Operador Unário de Incremento: " + numero);
        numero--;
        System.out.println("Operador Unário de Decremento: " + numero);
        numero =+ 5;
        System.out.println("Operador Unário de Atribuição: " + numero);

        // OPERADOR TERNÁRIO
        String resultadoTernario;
        int a = 5, b = 6;
        resultadoTernario = (a == b) ? "verdadeiro" : "falso"; // Se a for igual a b, então verdadeiro, senão falso
        System.out.println("Operador Ternário: " + resultadoTernario);

        // OPERADORES RELACIONAIS
        String nome1 = "William";
        String nome2 = "William";
        System.out.println("Comparação de Strings com == : " + (nome1 == nome2));

        int numero1 = 1;
        int numero2 = 2;

        if (numero1 == numero2) {
            System.out.println("Numero um é igual a numero dois");
        } else {
            System.out.println("Numero um é diferente de numero dois");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("Numero um é igual a numero dois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero um é diferente de numero dois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero um é maior que numero dois? " + simNao);

        // OPERADORES LÓGICOS
        boolean condicao1 = false;
        boolean condicao2 = true;

        if (condicao1 || condicao2) { // Testar com && e ||
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }
    }
}
