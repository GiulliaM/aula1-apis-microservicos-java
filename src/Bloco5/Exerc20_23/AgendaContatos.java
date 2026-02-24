package Bloco5.Exerc20_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaContatos {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n AGENDA DE CONTATOS ");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar telefone pelo nome");
            System.out.println("3. Listar  os contatos da agenda");
            System.out.println("4. Verificar existência de nome e telefone");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("Digite o telefone: ");
                    String telefone = leitor.nextLine();
                    agenda.put(nome, telefone);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome para buscar: ");
                    String busca = leitor.nextLine();
                    if (agenda.containsKey(busca)) {
                        System.out.println("Telefone de " + busca + ": " + agenda.get(busca));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    if (agenda.isEmpty()) {
                        System.out.println("A agenda está vazia.");
                    } else {
                        System.out.println("\n--- LISTA DE CONTATOS ---");
                        for (Map.Entry<String, String> contato : agenda.entrySet()) {
                            System.out.println("Nome: " + contato.getKey() + " | Tel: " + contato.getValue());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite um nome para verificar: ");
                    String verificaNome = leitor.nextLine();

                    if (agenda.containsKey(verificaNome)) {
                        System.out.println("O nome existe na agenda.");
                    } else {
                        System.out.println("O nome NÃO existe na agenda.");
                    }

                    System.out.print("Digite um telefone para verificar: ");
                    String verificaTelefone = leitor.nextLine();

                    if (agenda.containsValue(verificaTelefone)) {
                        System.out.println("O telefone existe na agenda.");
                    } else {
                        System.out.println("O telefone NÃO existe na agenda.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando a agenda...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();
    }
}