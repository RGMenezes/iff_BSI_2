package POO.Casa.Exercicio07.Exercicio02.model;

public class Livro extends ItemBiblioteca implements Emprestavel {
    public Livro(String titulo, int ano) {
        super(titulo, ano);
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("Livro '" + titulo + "' já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro '" + titulo + "' devolvido com sucesso.");
        } else {
            System.out.println("Livro '" + titulo + "' não estava emprestado.");
        }
    }
}