import java.util.Scanner;

public class Idade_Dias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        int dias = (idade * 365);

        System.out.println("A sua idade aproximada em dias é: " + dias + ".");

        leitor.close();
    }
}
