import java.util.Scanner;
// 4) Crie um algoritmo que leia o preço de 1 litro de combustível e o valor que uma pessoa possui para abastecer. 
// Calcule e mostre quantos litros ela conseguirá comprar.
public class  E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar objeto scanner

        System.out.print("Valor da Gasolina Comum(1L): ");
        double gasolinaPreco = scanner.nextDouble();

        System.out.print("Valor Disponível para o Abastecimento: ");
        double capitalGasolina = scanner.nextDouble();

        double litrosTotais = capitalGasolina/gasolinaPreco;

        
        System.out.printf("Quantidade de Litros Abastecidos: %.2f L", litrosTotais);
        

        scanner.close();
    }
}