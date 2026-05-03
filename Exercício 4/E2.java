import java.util.Scanner;
// Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias:
//infantil A = 5-7 anos
//infantil B = 8-10 anos
//juvenil A = 11-13 anos
//juvenil B = 14-17 anos
// adulto = maiores de 18 anos
public class E2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = leitor.nextInt();

        if (idade < 5) {
            System.out.println("Idade insuficiente para as categorias cadastradas.");
        } else if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else {
            // 18 ou mais
            System.out.println("Categoria: Adulto");
        }

        leitor.close();
    }
}