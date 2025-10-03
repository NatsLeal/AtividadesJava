import java.util.Scanner;

public class Calculadora_Gorjeta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor total da conta do restaurante: ");
        double conta = leitor.nextDouble();
        double gorjeta = (conta * 0.10);

        System.out.println("O valor da gorjeta é : " + gorjeta + ".");

        leitor.close();
    }
}
