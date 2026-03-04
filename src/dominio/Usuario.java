package dominio;

public class Usuario {
    private static int contador = 1;
    private int id;
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.id = contador++;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return "Usuario";
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);

    }

}
