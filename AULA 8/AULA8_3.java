import java.util.Scanner;

public class AULA8_3 {
   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Preços base
        double precoGasolina = 6.00;
        double precoAlcool = 4.50;

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipo = leitor.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros: ");
        double litros = leitor.nextDouble();

        double valorFinal = 0;

        if (tipo == 'A') {
            // Regras do Álcool
            if (litros <= 20) {
                valorFinal = litros * (precoAlcool * 0.97); // 3% de desconto
            } else {
                valorFinal = litros * (precoAlcool * 0.95); // 5% de desconto
            }
            System.out.printf("Total a pagar (Álcool): R$ %.2f%n", valorFinal);

        } else if (tipo == 'G') {
            // Regras da Gasolina
            if (litros <= 20) {
                valorFinal = litros * (precoGasolina * 0.96); // 4% de desconto
            } else {
                valorFinal = litros * (precoGasolina * 0.94); // 6% de desconto
            }
            System.out.printf("Total a pagar (Gasolina): R$ %.2f%n", valorFinal);

        } else {
            System.out.println("Tipo de combustível inválido.");
        }

        leitor.close();
    } 
}
