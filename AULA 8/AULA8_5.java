public class AULA8_5 {
    public static void main(String[] args) {
        int[] notas = {7, 8, 6, 10, 9};
        
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        // 2. Calcular a média
        double media = soma / notas.length;
        System.out.println("Média das notas: " + media);
        
        // 3. Contar quantas notas estão acima da média
        int contadorAcima = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                contadorAcima++;
            }
        }
        
        System.out.println("Quantidade de notas acima da média: " + contadorAcima);
    }
}
