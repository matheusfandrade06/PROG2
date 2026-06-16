import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GerenciadorSistema {
    private List<Veiculo> frota;
    private List<Cliente> clientes;
    private List<Locacao> locacoes;

    public GerenciadorSistema() {
        this.frota = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.locacoes = new ArrayList<>();
    }

    public void cadastrarVeiculo(Veiculo v) {
        frota.add(v);
        System.out.println("Veículo cadastrado com sucesso: " + v.getPlaca());
    }

    public void listarVeiculos() {
        System.out.println("\n--- LISTA DE VEÍCULOS ---\n ");
        for (Veiculo v : frota) {
            v.exibirDetalhes();
        }
    }
    public void listarClientes() {
        System.out.println("\n--- LISTA DE CLIENTES ---\n ");
        for (Cliente c : clientes) {
            c.exibirDetalhes();
        }
    }

    public void editarPrecoVeiculo(String placa, double novoPreco) {
        for (Veiculo v : frota) {
            if (v.getPlaca().equals(placa)) {
                v.setPrecoDiaria(novoPreco);
                System.out.println("Preço atualizado para o veículo " + placa);
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    public void removerVeiculo(String placa) {
        frota.removeIf(v -> v.getPlaca().equals(placa));
        System.out.println("Veículo " + placa + " removido (se existia).");
    }

    public void buscarDisponiveis() {
        System.out.println("\n--- VEÍCULOS DISPONÍVEIS ---");
        for (Veiculo v : frota) {
            if (v.isDisponivel()) {
                v.exibirDetalhes();
            }
        }
    }

    public void realizarLocacao(Cliente c, Veiculo v, int dias) throws Exception {
        if (c == null) { // O sistema irá procurar na lista de Cliente(Cliente). caso o usuário digite um CPF que não esteja cadastrado o sistema irá identificar 'c' como vazio(null) e irá lançar a Exception personalizada.
            throw new IllegalArgumentException("Cliente inválido."); //Definindo o e.getmessage() para exibir a mensagem personalizada de erro.
        }
        else if (v == null) {
            throw new IllegalArgumentException("Veículo inválido."); //Polimorfismo na declaração de Exceptions
        } else if (dias <= 0) {
            throw new IllegalArgumentException("Número de dias inválido."); //Polimorfismo na declaração de Exceptions
        }
        if (!v.isDisponivel()) {
            System.out.println("Erro: O veículo " + v.getPlaca() + " já está alugado!");
            return;
        }
        
        Locacao locacao = new Locacao(v, c, dias);
        v.setDisponibilidade(false); // Marca como indisponível
        locacoes.add(locacao);
        
        System.out.println("\nLocação realizada com sucesso!");
        locacao.gerarRecibo();
    }

    public static void main(String[] args) {
        GerenciadorSistema sistema = new GerenciadorSistema();
        Scanner scanner = new Scanner(System.in);
        
        //Dados Iniciais (Teste) 
         Cliente clienteTeste = new Cliente("Quirino", "123.456.789-00", "(81) 99999-9999");
         sistema.clientes.add(clienteTeste);
         Carro carro1 = new Carro("ABC-1234", "Fiat", "Argo", 100.0, 4, true);
         Carro carro2 = new Carro("XYZ-9876", "Renault", "Kwid", 80.0, 4, false);
         Moto moto1 = new Moto("MOT-5555", "Honda", "CG 160", 50.0, 160, true);
        sistema.cadastrarVeiculo(carro1);
        sistema.cadastrarVeiculo(carro2);
        sistema.cadastrarVeiculo(moto1);
        System.out.println("\n--- Bem-vindo ao Sistema de Locação de Veículos! ---");
        boolean i= true;
        while (i = true) {
           System.out.println("\n 1. Cadastrar Clientes");
           System.out.println(" 2. Cadastrar Veículos");
           System.out.println(" 3. Listar Veículos");
           System.out.println(" 4. Editar Preço de Veículo");
           System.out.println(" 5. Remover Veículo");
           System.out.println(" 6. Buscar Disponíveis");
           System.out.println(" 7. Realizar Locação");
           System.out.println(" 8. Listar Clientes");
           System.out.println(" 0. Sair");
           System.out.print("\n Escolha uma das Opções: ");
           String opcao = scanner.nextLine();
           try{ // tratamento da excpetion: NumberFormatException
            int numero = Integer.parseInt(opcao); 
            if (numero < 0 || numero > 8) {
                throw new NumberFormatException ();
            } 
           } catch(NumberFormatException e){
            System.out.println("Opção inválida. Por favor, escolha uma opção entre 0 e 8.");
            continue; // Volta para o início do loop para solicitar uma nova entrada
           }
           int numero = Integer.parseInt(opcao);
           if (numero == 0) {
             System.out.println("Encerrando o sistema. Até mais!");
             break;
           }
           if (numero == 1) {
                System.out.println("\n--- Faça o seu Cadastro: ");
                System.out.println("\nNome Completo:");
                String nome = scanner.nextLine();
                System.out.println("CPF:");
                String cpf = scanner.nextLine();
                System.out.println("Telefone:");
                String telefone = scanner.nextLine();
                Cliente cli1 = new Cliente(nome, cpf, telefone);
                sistema.clientes.add(cli1);
                System.out.println("Cliente cadastrado com sucesso: " + nome);
            }
           if (numero == 2){
                System.out.println("\n--- Faça o cadastro do veículo: ");
                System.out.println("\nPlaca do Carro:");
                String placa = scanner.nextLine();
                System.out.println("Marca:");
                String marca = scanner.nextLine();
                System.out.println("Modelo:");
                String modelo = scanner.nextLine();
                System.out.println("Preço da Diária:");
                double precoDiaria = scanner.nextDouble();
                scanner.nextLine(); // Limpar o buffer
                Veiculo veiculo = new Carro(placa, marca, modelo, precoDiaria, 4, true);
                sistema.cadastrarVeiculo(veiculo);
           }
           if (numero == 3){
             sistema.listarVeiculos();
           }
           if (numero == 8){
             sistema.listarClientes();
           }
           if (numero == 4){
             System.out.println("\nDigite a placa do veículo para editar o preço:");
             String placa = scanner.nextLine();
             System.out.println("Digite o novo preço da diária:");
             double novoPreco = scanner.nextDouble();
             sistema.editarPrecoVeiculo(placa, novoPreco);
                scanner.nextLine(); // Limpar o buffer
           }
           if (numero ==5){
             System.out.println("\nDigite a placa do veículo para remover:");
             String placa = scanner.nextLine();
             sistema.removerVeiculo(placa);
           }
           if (numero ==6){
             sistema.buscarDisponiveis();
           }
           if (numero ==7){
             System.out.println("\nDigite o CPF do cliente:");
             String cpf = scanner.nextLine();
             Cliente cliente = null;
             for (Cliente c : sistema.clientes) {
                if (c.getCpf().equals(cpf)) {
                    cliente = c;
                    break;
                }
             }
             System.out.println("\nDigite a placa do veículo:");
             String placa = scanner.nextLine();
             Veiculo veiculo = null;
             for (Veiculo v : sistema.frota) {
                 if (v.getPlaca().equals(placa)) {
                 veiculo = v;
                 break;
                }
             }
             System.out.println("\nDigite o número de dias para a locação:");
             int dias = scanner.nextInt();
             scanner.nextLine(); // Limpar o buffer
             try{
                sistema.realizarLocacao(cliente, veiculo, dias);            
             } catch(Exception e){
                System.out.println("Erro: " + e.getMessage()); // polimorfismo no tratamento de Exceptions
                continue; // Volta para o início do loop para solicitar uma nova entrada
             }
             
            }
        }

    }
}