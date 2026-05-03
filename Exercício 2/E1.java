import java.util.Scanner;
//1) Desenvolva um algoritmo em Java que leia um número inteiro doterminal e imprima:
// • o dobro desse número;
// • o triplo desse número.
public class  E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar objeto scanner
        
        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        
        System.out.println("O Dobro desse Número é: " + 2*num1);
        System.out.println("O Triplo desse Número é: " + 3*num1);
        
        scanner.close();
    }
}