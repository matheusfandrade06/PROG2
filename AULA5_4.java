import java.util.Scanner;

public class  AULA5_4 {
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