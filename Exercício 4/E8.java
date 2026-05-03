//8 - Peça ao usuário para inserir um número. Use um laço de repetição para calcular e exibir a tabuada de multiplicação desse número, de 1 a 10.
import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = leitor.nextInt();

        System.out.println("\nTabuada de " + numero + ":");
        
        // O laço 
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        leitor.close();
    }
}
