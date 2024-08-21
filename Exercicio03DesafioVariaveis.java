import java.text.DecimalFormat;

public class DesafioVariaveis {
    public static void main(String[] args) {
        // Criação de variáveis
        String produto = "Teclado Mecânico";
        double precoUnitario = 250.75;
        int quantidade = 10;
        double taxaImposto = 0.18;
        double margemLucro = 0.25;

        // Operações simples
        double valorTotalSemImpostos = precoUnitario * quantidade;
        double valorImposto = valorTotalSemImpostos * taxaImposto;
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;
        double precoVendaSugerido = valorTotalComImpostos * (1 + margemLucro);

        // Desafio Extra
        DecimalFormat formato = new DecimalFormat("R$ #,##0.00");
        String valorTotalComImpostosFormatado = formato.format(valorTotalComImpostos);
        String precoVendaSugeridoFormatado = formato.format(precoVendaSugerido);
        String mensagem = "Produto: " + produto + "\n" +
                          "Valor total com impostos: " + valorTotalComImpostosFormatado + "\n" +
                          "Preço de venda sugerido: " + precoVendaSugeridoFormatado;

        // Exibição dos resultados
        System.out.println("Produto: " + produto);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Quantidade Comprada: " + quantidade);
        System.out.println("Valor Total Sem Impostos: R$ " + valorTotalSemImpostos);
        System.out.println("Valor do Imposto: R$ " + valorImposto);
        System.out.println("Valor Total Com Impostos: " + valorTotalComImpostosFormatado);
        System.out.println("Preço de Venda Sugerido: " + precoVendaSugeridoFormatado);
        System.out.println(mensagem);
    }
}
