// Veiculo.java
public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double precoDiaria;
    private boolean disponivel;

    public Veiculo(String placa, String marca, String modelo, double precoDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precoDiaria = precoDiaria;
        this.disponivel = true; // Todo veículo cadastrado começa disponível
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa + " | Marca: " + marca + " | Modelo: " + modelo + " | Diária: R$" + precoDiaria + " | Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public void setDisponibilidade(boolean status) {
        this.disponivel = status;
    }

    // Getters e Setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPrecoDiaria() { return precoDiaria; }
    public void setPrecoDiaria(double precoDiaria) { this.precoDiaria = precoDiaria; }

    public boolean isDisponivel() { return disponivel; }
}