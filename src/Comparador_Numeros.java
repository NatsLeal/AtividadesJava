import java.util.Scanner;

public class Comparador_Numeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        if (num1 > num2) {
            System.out.println("O número " + num1 +  " é maior.");
        } else {
            System.out.println("O número " + num2 +  " é maior.");
        }

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        }
        leitor.close();

    }
}
