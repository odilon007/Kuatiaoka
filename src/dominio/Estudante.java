package dominio;

public class Estudante extends Usuario {
    private String matricula;

    public Estudante(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    @Override
    public String getTipo() {
        return "Estudante";
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
