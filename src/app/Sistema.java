package app;

import java.util.Scanner;

import dominio.Estudante;
import dominio.Funcionario;
import dominio.Usuario;
import ui.Menu;
import java.util.HashMap;
import java.util.Map;


public class Sistema {
    private Menu menu = new Menu();
    private Scanner sc = new Scanner(System.in);
    private Map<Integer, Usuario> users = new HashMap<>();


    public void iniciar() {
        int op;
        do {
            menu.inicial();
            op = sc.nextInt();
            executarOperacao(op);
        } while (op != 5);
    }

    private void executarOperacao(int opInicial) {
        String mensagem = null;
        switch (opInicial) {
            case 1:
                gerenciarItens();
                mensagem = "Matheus não sabe Java!";
                break;
            case 2:
                gerenciarUsuarios();
                break;
            case 3:
                mensagem = "Matheus não sabe Java!";
                break;
            case 4:
                mensagem = "Matheus não sabe Java!";
                break;
            case 5:
                mensagem = "Saindo...";
                break;
            default:
                mensagem = "Matheus não sabe digitar um numero de 1 a 5";
                break;
        }
        if (mensagem != null) {
            System.out.println(mensagem);
        }
    }

    private void gerenciarItens() {
        menu.gerenciarItens();
        return;
    }
    private void gerenciarUsuarios() {
        menu.gerenciarUsuarios();
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
                cadastrarUsuario();
                break;
            case 2:
                consultarUsuarios();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
    private void cadastrarUsuario() {
        System.out.println("[1] Funcionario");
        System.out.println("[2] Estudante");

        int op = sc.nextInt();
        sc.nextLine();

        if (op != 1 && op != 2) return;

        System.out.printf("Nome: ");
        String nome = sc.nextLine();
        System.out.printf("Email: ");
        String email = sc.nextLine();

        switch (op) {
            case 1:
                System.out.printf("Digite seu salario: ");

                float salario = sc.nextFloat();
                sc.nextLine();
                Usuario funcionario = new Funcionario(nome, email, salario);
                users.put(funcionario.getId(), funcionario);

                System.out.println("\nCadastro do funcionário realizado com sucesso!");
                System.out.println("Pressione ENTER para continuar...\n");
                sc.nextLine();
                gerenciarUsuarios();
                break;
            case 2:
                System.out.printf("Digite sua matricula: ");

                String matricula = sc.nextLine();
                Usuario estudante = new Estudante(nome, email, matricula);
                users.put(estudante.getId(), estudante);

                System.out.println("\nCadastro do estudante realizado com sucesso!");
                System.out.println("Pressione ENTER para continuar...\n");
                sc.nextLine();
                gerenciarUsuarios();
                break;
            default:
                break;
        }
    }
    private void consultarUsuarios() {
        System.out.println("USUÁRIOS\n");
        System.out.printf("%-5s %-20s %-40s %-15s%n", "ID", "Nome", "Email", "Tipo");
        System.out.println("---------------------------------------------------------------------------");
        for (Usuario user : users.values()) {
            System.out.printf("%-5s %-20s %-40s %-15s\n",
                    user.getId(),
                    user.getNome(),
                    user.getEmail(),
                    user.getTipo()
            );
        }
        System.out.println("\nPressione ENTER para continuar...");
        sc.nextLine();
        gerenciarUsuarios();
    }
}
