import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma temperatura em graus Celsius: ");
        double celsius = leitor.nextDouble();
        double fahrenheit = ((celsius * 1.8) +32);

        System.out.println(celsius + " graus Celsius são " + fahrenheit + " graus Fahrnheit.");

        leitor.close();
    }
}
