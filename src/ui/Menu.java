package ui;

public class Menu {
    public void inicial() {
        System.out.printf("KUATIOKA\n\n");
        System.out.println("[1] Gerenciar Itens");
        System.out.println("[2] Gerenciar Usuários");
        System.out.println("[3] Operações (Empréstimo/Devolução)");
        System.out.println("[4] Consultas");
        System.out.println("[5] Sair");
    }

    public void gerenciarUsuarios() {
        System.out.printf("GERENCIAR USUARIOS\n\n");
        System.out.println("[1] Cadastrar usuario");
        System.out.println("[2] Consultar usuarios");
        System.out.println("[3] Atualizar usuarios");
        System.out.println("[4] Deletar usuarios");

    }
    public void gerenciarItens() {
        System.out.printf("GERENCIAR ITENS\n\n");
        System.out.println("[1] Cadastrar item");
        System.out.println("[2] Consultar itens");
        System.out.println("[3] Atualizar itens");
        System.out.println("[4] Deletar itens");
    }
}
