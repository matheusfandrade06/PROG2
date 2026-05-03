// 5) Crie um programa com a string “Computação” e mostre: o primeiro caractere, o terceiro caractere, o último caractere
public class E5 {
    public static void main(String[] args) {
        String linha = "Computação";
        char char0 = linha.charAt(0);
        char char3 = linha.charAt(2);
        char charf = linha.charAt(9);

        System.out.printf( "Primeiro Caractere: %c\nTerceiro Caractere: %c\nÚltimo Caractere: %c", char0, char3, charf);
    }
}
