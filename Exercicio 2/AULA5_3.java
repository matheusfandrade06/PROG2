import java.util.Scanner;

public class  AULA5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar objeto scanner

        System.out.print("Digite o valor Unitário do Produto: ");
        double ValorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada do Produto: ");
        int quantidade = scanner.nextInt();

        double ValorTotal = ValorUnitario * quantidade;
        double ValorTotaldescontado = ValorTotal * 92/100;
         

        if (ValorTotal > 100){
            System.out.println("Valor total da compra Foi: R$" + ValorTotal);
            System.out.println("Foi aplicado um desconto condicional de 8% (Valor da Compra > R$ 100,00)");
            System.out.println("Valor Final da compra: R$" + ValorTotaldescontado);
        }
        else{
            System.out.println("Valor final da compra: R$" + ValorTotal);
            
        }
        
        scanner.close();
    }
}