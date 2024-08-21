public class Exercicio01VariaveisSimples {
    public static void main(String[] args) {
        // Criação de variáveis
        int idade = 20;
        double altura = 1.75;
        String nome = "Carlos";
        boolean ehEstudante = true;

        // Operações simples
        int outraIdade = 22;
        int somaIdades = idade + outraIdade;
        double alturaDobro = altura * 2;
        String saudacao = "Olá, " + nome + "!";

        // Exibição dos resultados
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        System.out.println("É estudante? " + ehEstudante);
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Altura dobrada: " + alturaDobro);
        System.out.println(saudacao);
    }
}
