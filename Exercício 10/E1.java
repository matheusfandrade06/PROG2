import java.util.InputMismatchException;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sucesso = false;

        while (!sucesso) {
            try {
                System.out.print("Digite o primeiro número inteiro(Numerador): ");
                int num1 = scanner.nextInt();

                System.out.print("Digite o segundo número inteiro(Denominador): ");
                int num2 = scanner.nextInt();
                int resultado = num1 / num2;
                System.out.println("\nResultado: " + resultado);
                sucesso = true; 

            } catch (InputMismatchException e) {
                System.out.println("\n[Erro] Você não digitou um número inteiro.");
                scanner.nextLine(); 

            } catch (ArithmeticException e) {
                // Captura o erro matemático de divisão por zero
                System.out.println("\n[Erro] divisão por zero.");
            }
        }

        scanner.close();
    }
}