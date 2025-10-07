import java.util.Scanner;

public class Aprovação_Escolar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = leitor.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        leitor.close();
    }
    }
