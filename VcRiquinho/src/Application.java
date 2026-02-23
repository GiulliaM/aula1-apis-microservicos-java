import model.cliente.*;
import model.conta.*;
import model.produto.*;
import service.*;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        GerenciadorClientes gc = new GerenciadorClientes();
        GerenciadorProdutos gp = new GerenciadorProdutos();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n=== SISTEMA VCRIQUINHO ===");
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Produtos");
            System.out.println("3. Simular Rendimentos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    submenuClientes(scanner, gc, gp);
                    break;
                case 2:
                    submenuProdutos(scanner, gp);
                    break;
                case 3:
                    menuSimulacao(scanner, gc, gp);
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    // menu cliente
    private static void submenuClientes(Scanner scanner, GerenciadorClientes gc, GerenciadorProdutos gp) {
        int op = 0;
        while (op != 5) {
            System.out.println("\n--- GERENCIAR CLIENTES ---");
            System.out.println("1. Cadastrar Novo Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Atualizar Cliente");
            System.out.println("4. Remover Cliente");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Tipo (1 - PF, 2 - PJ): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();

                    Cliente novoCliente;
                    if (tipo == 1) {
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();
                        novoCliente = new PessoaFisica(nome, email, cpf);
                    } else {
                        System.out.print("CNPJ: ");
                        String cnpj = scanner.nextLine();
                        novoCliente = new PessoaJuridica(nome, email, cnpj);
                    }

                    System.out.print("Deseja abrir qual conta inicial? (1 - Corrente, 2 - CDI, 3 - Investimentos Automático): ");
                    int tipoConta = scanner.nextInt();
                    System.out.print("Saldo Inicial: R$ ");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine();

                    if (tipoConta == 1) {
                        new ContaCorrente(novoCliente, saldo);
                    } else if (tipoConta == 2) {
                        new ContaCDI(novoCliente, saldo);
                    } else {
                        ContaInvestimentoAutomatico contaInv = new ContaInvestimentoAutomatico(novoCliente, saldo);
                        // Pega todos os produtos do banco da corretora e joga na carteira do cliente
                        for (ProdutoInvestimento p : gp.getTodosProdutos()) {
                            contaInv.adicionarProdutoCarteira(p);
                        }
                    }

                    gc.adicionarCliente(novoCliente);
                    break;
                case 2:
                    gc.listarClientes();
                    break;
                case 3:
                    System.out.print("Digite o nome atual do cliente: ");
                    String nomeAtual = scanner.nextLine();
                    System.out.print("Digite o NOVO nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o NOVO e-mail: ");
                    String novoEmail = scanner.nextLine();
                    gc.atualizarCliente(nomeAtual, novoNome, novoEmail);
                    break;
                case 4:
                    System.out.print("Digite o nome do cliente para remover: ");
                    String nomeRemover = scanner.nextLine();
                    gc.removerCliente(nomeRemover);
                    break;
                case 5:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // menu produtos
    private static void submenuProdutos(Scanner scanner, GerenciadorProdutos gp) {
        int op = 0;
        while (op != 5) {
            System.out.println("\n--- GERENCIAR PRODUTOS ---");
            System.out.println("1. Cadastrar Novo Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Remover Produto");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Tipo (1 - Renda Fixa, 2 - Renda Variável): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();

                    if (tipo == 1) {
                        System.out.print("Rendimento Mensal Fixo (ex: 0.01 para 1%): ");
                        double rendimento = scanner.nextDouble();
                        System.out.print("Período de Carência (em dias): ");
                        int carencia = scanner.nextInt();
                        gp.adicionarProduto(new RendaFixa(nome, desc, rendimento, carencia));
                    } else {
                        System.out.print("Rendimento Mensal Esperado (ex: 0.015 para 1.5%): ");
                        double rendimento = scanner.nextDouble();
                        gp.adicionarProduto(new RendaVariavel(nome, desc, rendimento));
                    }
                    break;
                case 2:
                    gp.listarProdutos();
                    break;
                case 3:
                    System.out.print("Digite o nome atual do produto: ");
                    String nomeAtual = scanner.nextLine();
                    System.out.print("Digite o NOVO nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite a NOVA descrição: ");
                    String novaDesc = scanner.nextLine();
                    gp.atualizarProduto(nomeAtual, novoNome, novaDesc);
                    break;
                case 4:
                    System.out.print("Digite o nome do produto para remover: ");
                    String nomeRemover = scanner.nextLine();
                    gp.removerProduto(nomeRemover);
                    break;
                case 5:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // simulacao
    private static void menuSimulacao(Scanner scanner, GerenciadorClientes gc, GerenciadorProdutos gp) {
        System.out.println("\n-- SIMULAÇÃO DE RENDIMENTOS --");
        System.out.print("Digite o nome do cliente para simular: ");
        String nome = scanner.nextLine();

        Cliente c = gc.buscarCliente(nome);
        if (c == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.print("Dias para simulação (30, 60, 90 ou 180): ");
        int dias = scanner.nextInt();
        scanner.nextLine();

        if (dias != 30 && dias != 60 && dias != 90 && dias != 180) {
            System.out.println("Período inválido! O sistema aceita apenas 30, 60, 90 ou 180 dias.");
            return;
        }

        System.out.println("\nResultado da Simulação para " + c.getNome() + " em " + dias + " dias:");
        for (Conta conta : c.getContas()) {
            // Se for conta de investimento, atualiza a carteira com os produtos cadastrados
            if (conta instanceof ContaInvestimentoAutomatico) {
                ((ContaInvestimentoAutomatico) conta).setCarteira(gp.getTodosProdutos());
            }

            double[] resultado = conta.simular(dias);
            System.out.printf("Conta: %s | Saldo Base: R$ %.2f\n", conta.getClass().getSimpleName(), conta.getSaldo());
            System.out.printf("Rendimento Bruto: R$ %.2f\n", resultado[0]);
            System.out.printf("Taxa de Serviço: R$ %.2f\n", resultado[1]);
            System.out.printf("Rendimento Líquido: R$ %.2f\n\n", (resultado[0] - resultado[1]));
        }
    }
}