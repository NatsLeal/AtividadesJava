import java.util.Scanner;

public class Calculadora_Soma {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        System.out.println("A Soma  é: " + (numero1 + numero2));

        leitor.close();
    }
}