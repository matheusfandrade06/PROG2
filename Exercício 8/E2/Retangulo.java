public class Retangulo {
    // Atributos privados com valor default 1.0
    private double altura = 1.0;
    private double largura = 1.0;

    // Construtor padrão (vazio, mantém os valores default 1.0)
    public Retangulo() {
    }

    // Método para calcular a área: base * altura
    public double calcularArea() {
        return this.largura * this.altura;
    }

    // Método para calcular o perímetro: 2 * (base + altura)
    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    // Getters e Setters com validação
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        // Validação: maior que 0.0 e menor que 20.0
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: A altura deve ser maior que 0.0 e menor que 20.0.");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        // Validação: maior que 0.0 e menor que 20.0
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: A largura deve ser maior que 0.0 e menor que 20.0.");
        }
    }
}