<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Adicionar gerente");
            System.out.println("2. Adicionar atendente");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("4. Mostrar salário de funcionário (por CPF)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Tratamento simples para evitar quebra se o usuário digitar texto no menu
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do teclado
            } else {
                System.out.println("Opção inválida!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastrar Gerente ---");
                    System.out.print("Nome: ");
                    String nomeG = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfG = scanner.nextLine();
                    System.out.print("Salário Base: R$ ");
                    double salarioG = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Data de Nascimento (DD/MM/AAAA): ");
                    String dataG = scanner.nextLine();

                    // Adiciona o Gerente no ArrayList de Funcionarios
                    listaFuncionarios.add(new Gerente(nomeG, cpfG, salarioG, dataG));
                    System.out.println("Gerente adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Cadastrar Atendente ---");
                    System.out.print("Nome: ");
                    String nomeA = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfA = scanner.nextLine();
                    System.out.print("Salário Base: R$ ");
                    double salarioA = scanner.nextDouble();
                    System.out.print("Comissão: R$ ");
                    double comissaoA = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Data de Nascimento (DD/MM/AAAA): ");
                    String dataA = scanner.nextLine();

                    // Adiciona o Atendente no ArrayList de Funcionarios
                    listaFuncionarios.add(new Atendente(nomeA, cpfA, salarioA, dataA, comissaoA));
                    System.out.println("Atendente adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Lista de Funcionários ---");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            System.out.println(f);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Buscar Salário por CPF ---");
                    System.out.print("Digite o CPF do funcionário: ");
                    String cpfBusca = scanner.nextLine();
                    boolean encontrado = false;

                    for (Funcionario f : listaFuncionarios) {
                        if (f.getCpf().equals(cpfBusca)) {
                            // Aqui acontece o Polimorfismo: o Java sabe em tempo de execução
                            // se deve chamar o método do Gerente (com bônus) ou do Atendente (com comissão).
                            System.out.println("Funcionário: " + f.getNome());
                            System.out.printf("Salário Total: R$ %.2f\n", f.getSalario());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Funcionário com o CPF informado não foi encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
=======
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Adicionar gerente");
            System.out.println("2. Adicionar atendente");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("4. Mostrar salário de funcionário (por CPF)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Tratamento simples para evitar quebra se o usuário digitar texto no menu
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do teclado
            } else {
                System.out.println("Opção inválida!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastrar Gerente ---");
                    System.out.print("Nome: ");
                    String nomeG = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfG = scanner.nextLine();
                    System.out.print("Salário Base: R$ ");
                    double salarioG = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Data de Nascimento (DD/MM/AAAA): ");
                    String dataG = scanner.nextLine();

                    // Adiciona o Gerente no ArrayList de Funcionarios
                    listaFuncionarios.add(new Gerente(nomeG, cpfG, salarioG, dataG));
                    System.out.println("Gerente adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Cadastrar Atendente ---");
                    System.out.print("Nome: ");
                    String nomeA = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfA = scanner.nextLine();
                    System.out.print("Salário Base: R$ ");
                    double salarioA = scanner.nextDouble();
                    System.out.print("Comissão: R$ ");
                    double comissaoA = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Data de Nascimento (DD/MM/AAAA): ");
                    String dataA = scanner.nextLine();

                    // Adiciona o Atendente no ArrayList de Funcionarios
                    listaFuncionarios.add(new Atendente(nomeA, cpfA, salarioA, dataA, comissaoA));
                    System.out.println("Atendente adicionado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Lista de Funcionários ---");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            System.out.println(f);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Buscar Salário por CPF ---");
                    System.out.print("Digite o CPF do funcionário: ");
                    String cpfBusca = scanner.nextLine();
                    boolean encontrado = false;

                    for (Funcionario f : listaFuncionarios) {
                        if (f.getCpf().equals(cpfBusca)) {
                            // Aqui acontece o Polimorfismo: o Java sabe em tempo de execução
                            // se deve chamar o método do Gerente (com bônus) ou do Atendente (com comissão).
                            System.out.println("Funcionário: " + f.getNome());
                            System.out.printf("Salário Total: R$ %.2f\n", f.getSalario());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Funcionário com o CPF informado não foi encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
>>>>>>> 5b9326cb4180cd97c8996eb71cdd88af2223bdd9
}