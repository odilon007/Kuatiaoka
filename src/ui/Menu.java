package ui;

public class Menu {
    public void inicial() {
        System.out.printf("KUATIOKA\n\n");
        System.out.println("[1] Gerenciar Itens");
        System.out.println("[2] Gerenciar Usuários");
        System.out.println("[3] Operações (Empréstimo/Devolução)");
        System.out.println("[4] Consultas");
        System.out.println("[0] Sair");
    }

    public void gerenciarUsuarios() {
        System.out.printf("GERENCIAR USUARIOS\n\n");
        System.out.println("[1] Cadastrar usuario");
        System.out.println("[2] Atualizar usuário");
        System.out.println("[3] Deletar usuário");
        System.out.println("[0] Voltar");

    }
    public void gerenciarItens() {
        System.out.printf("GERENCIAR ITENS\n\n");
        System.out.println("[1] Cadastrar item");
        System.out.println("[2] Atualizar item");
        System.out.println("[3] Deletar item");
        System.out.println("[0] Voltar");
    }

    public void consultas() {
        System.out.println("[1] Consultar Itens");
        System.out.println("[2] Consultar Usuários");
        System.out.println("[3] Consultar Empréstimos");
        System.out.println("[4] Consultar Devoluções");
        System.out.println("[0] Voltar");
    }

    public void opInvalido() {
        System.out.println("Opção inválida");
    }
}
