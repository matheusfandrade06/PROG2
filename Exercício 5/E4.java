//4. Crie um método chamado contarParesImpares que recebe um array de inteiros e retorna um novo array de 2 posições, onde a primeira posição contém a quantidade de números pares e a segunda, a quantidade de números ímpares.
public class E4 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] resultado = contarParesImpares(numeros);
        
        System.out.println("Lista de Números da Array: " + java.util.Arrays.toString(numeros));
        System.out.println("Quantidade de números pares: " + resultado[0]);
        System.out.println("Quantidade de números ímpares: " + resultado[1]);
    }

    public static int[] contarParesImpares(int[] numeros) {
    int pares = 0;
    int impares = 0;
    
    for (int n : numeros) {
        if (n % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
    }
    
    return new int[]{pares, impares};
}
}
