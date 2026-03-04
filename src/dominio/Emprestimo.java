package dominio;

import dominio.Usuario;
public class Emprestimo {
    private Usuario usuario;
    private Item item;

    public Emprestimo(Usuario usuario, Item item) {
        this.usuario = usuario;
        this.item = item;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
