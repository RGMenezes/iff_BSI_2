package POO.Casa.Exercicio04.model;

public abstract class CartaoWeb {
    private String destinatario;

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public abstract void showMessage();
}