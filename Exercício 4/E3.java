import java.util.Scanner;
//3) Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// Álcool: até 20 litros, desconto de 3% por litro  || acima de 20 litros, desconto de 5% por litro
// Gasolina até 20 litros, desconto de 4% por litro || acima de 20 litros, desconto de 6% por litro
//A) Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 6,00 e o preço do litro do álcool é R$ 4,50.
public class E3 {
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
