import java.util.Scanner;

public class  AULA5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar objeto scanner

        System.out.print("Porcentagem da Taxa de serviço(%): ");
        double taxaServico = scanner.nextDouble();

        System.out.print("Código do Produto 1: ");
        double codigo1 = scanner.nextDouble();
        System.out.print("Valor do Produto 1: ");
        double Valor1 = scanner.nextDouble();
        System.out.print("Quantidade Comprada do Produto 1: ");
        double quantidade1 = scanner.nextDouble();

        
        System.out.print("Código do Produto 2: ");
        double codigo2 = scanner.nextDouble();
        System.out.print("Valor do Produto 2: ");
        double Valor2 = scanner.nextDouble();
        System.out.print("Quantidade Comprada do Produto 2: ");
        double quantidade2 = scanner.nextDouble();

        double valorCompra = (Valor1 * quantidade1) + (Valor2 * quantidade2);
        double valorTaxa = valorCompra * (taxaServico/100);
        double valorTotal = valorCompra + valorTaxa;
        
        System.out.printf("Valor da Compra: R$ %.2f ", valorCompra);
        System.out.printf("Valor da taxa: R$ %.2f ", valorTaxa);
        System.out.printf("Valor total: R$ %.2f", valorTotal);


        
        

        scanner.close();
    }
}