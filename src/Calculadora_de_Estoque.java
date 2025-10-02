public class Calculadora_de_Estoque {
    public static void main(String[] args) {
        String nomeProduto = "canetas";
        double precoProduto = 1.99;
        int quantidade = 115;
        double total = precoProduto * quantidade;

        System.out.println("O valor total do estoque de " + nomeProduto + " é: R$" + total);
    }
}
