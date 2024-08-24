public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis primitivas
        byte idade = 30; // -128 até 127
        short idadeCurta = 31; // -32768 até 32767
        int idadeMedia = 32; // -2.147.483.648 até 2.147.483.647
        long idadeLonga = 33; // -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807
        float salarioFloat = 1000f; // 32 bits
        double salarioDouble = 1000.0; // 64 bits
        boolean isVerdadeiro = true;
        boolean isFalso = false;
        char inicialNome = 'M';
        String nomeCompleto = "Matheus";

        // Impressão das variáveis primitivas
        System.out.println("Idade: " + idade);
        System.out.println("Idade Curta: " + idadeCurta);
        System.out.println("Idade Média: " + idadeMedia);
        System.out.println("Idade Longa: " + idadeLonga);
        System.out.println("Salário Float: " + salarioFloat);
        System.out.println("Salário Double: " + salarioDouble);
        System.out.println("Verdadeiro: " + isVerdadeiro);
        System.out.println("Falso: " + isFalso);
        System.out.println("Inicial do Nome: " + inicialNome);
        System.out.println("Nome Completo: " + nomeCompleto);

        // Casting de variáveis
        long numeroGrande = 1000000000000000L;
        int numeroPequeno = (int) numeroGrande;
        System.out.println("Número Grande: " + numeroGrande);
        System.out.println("Número Pequeno (após casting): " + numeroPequeno);

        // Declaração de constantes
        final int ANO_NASCIMENTO = 2000;
        System.out.println("Ano de Nascimento: " + ANO_NASCIMENTO);

        // Exemplo de variáveis mutáveis
        int dia = 1;
        System.out.println("Dia: " + dia);
        dia = 2;
        System.out.println("Dia Atualizado: " + dia);
    }
}
