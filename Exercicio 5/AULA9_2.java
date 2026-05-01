// 2. Crie um método que recebe um array de inteiros e retorna maior valor presente no array.
public class AULA9_2 {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 2, 9, 5};
        int maiorNumero = buscarMaior(numeros);
        
        System.out.printf("Array analisado: %s%n", java.util.Arrays.toString(numeros));
        System.out.println("O maior número é: " + maiorNumero);
    }
    
    public static int buscarMaior(int[] numeros) {
    if (numeros == null || numeros.length == 0) {
        throw new IllegalArgumentException("O array não pode estar vazio.");
    }
    
    int maior = numeros[0];
    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
    }
    return maior;
}
}
