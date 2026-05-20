public class TesteRetangulo {
    public static void main(String[] args) {
        System.out.println("=== Testando a Classe Retangulo ===");

        // 1. Criando um retângulo com os valores default
        Retangulo r1 = new Retangulo();
        System.out.println("\nRetângulo 1 (Valores Padrão):");
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Largura: " + r1.getLargura());
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());

        // 2. Criando um retângulo e modificando com valores válidos
        Retangulo r2 = new Retangulo();
        r2.setAltura(5.5);
        r2.setLargura(10.2);
        System.out.println("\nRetângulo 2 (Valores Válidos):");
        System.out.println("Altura: " + r2.getAltura());
        System.out.println("Largura: " + r2.getLargura());
        System.out.println("Área: " + r2.calcularArea());
        System.out.println("Perímetro: " + r2.calcularPerimetro());

        // 3. Testando as validações (valores limites e inválidos)
        System.out.println("\n--- Testando Limites de Validação ---");
        
        // Tentando setar valor menor ou igual a 0.0
        System.out.print("Tentando setar altura = 0.0: ");
        r2.setAltura(0.0); 
        
        // Tentando setar valor maior ou igual a 20.0
        System.out.print("Tentando setar largura = 20.0: ");
        r2.setLargura(20.0);

        // Tentando setar número negativo
        System.out.print("Tentando setar altura = -3.5: ");
        r2.setAltura(-3.5);

        // Verificando que o Retângulo 2 manteve os últimos valores válidos
        System.out.println("\nEstado final do Retângulo 2 após tentativas inválidas:");
        System.out.println("Altura atual: " + r2.getAltura() + " (deve continuar 5.5)");
        System.out.println("Largura atual: " + r2.getLargura() + " (deve continuar 10.2)");
    }
}