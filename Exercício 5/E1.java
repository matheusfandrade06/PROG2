//1. Crie um método que receba dois parâmetros de números double (a e b)correspondendo a valores dos catetos de um triângulo retângulo e retorne o valor da hipotenusa ○ Use a função Math.sqrt(x) para obter a raiz de um número.

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do cateto a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor do cateto b: ");
        double b = scanner.nextDouble();

        double resultado = calcularHipotenusa(a, b);
        System.out.printf("O valor da hipotenusa é: %.2f%n", resultado);
    }
    
    public static double calcularHipotenusa(double a, double b) {
    return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}