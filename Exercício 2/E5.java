import java.util.Scanner;
//5) O valor de um ingresso para cinema é de R$ 40,00. Escreva um algoritmo que leia o tipo de ingresso desejado pelo usuário: 'I' para ingresso inteiro; 'M' para meia-entrada, e Mostre o valor a ser pago. 
// Obs.: quem escolher meia-entrada paga 50% do valor normal.
public class  E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criar objeto scanner
        
        System.out.print("Digite o ingresso desejado: ");
        String ingresso = scanner.nextLine();

        if (ingresso.equals("inteiro") ){
          System.out.println("Valor da Compra: R$40,00" );
        }
        else if (ingresso.equals("meia-entrada") || ingresso.equals("meia")){
          System.out.println("Valor da Compra: R$20,00" );
        }
        else{
            System.out.println("Tipo de ingresso inválido! ");
        }
        
        scanner.close();
    }
}