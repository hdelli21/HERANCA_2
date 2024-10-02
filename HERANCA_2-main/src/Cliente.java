public class Cliente extends Pessoas {

    String email;
    String cartaofidelidade;
    String telefone;

    public Cliente() {
    }

    public Cliente(String email, String cartaofidelidade, String telefone) {
        this.email = email;
        this.cartaofidelidade = cartaofidelidade;
        this.telefone = telefone;
    }

    public void Comprar(String compra) {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCartaofidelidade() {
        return cartaofidelidade;
    }

    public void setCartaofidelidade(String cartaofidelidade) {
        this.cartaofidelidade = cartaofidelidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}