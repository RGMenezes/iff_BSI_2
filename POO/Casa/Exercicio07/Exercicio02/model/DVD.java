package POO.Casa.Exercicio07.Exercicio02.model;

public class DVD extends ItemBiblioteca implements Emprestavel {
    public DVD(String titulo, int ano) {
        super(titulo, ano);
    }  
    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("DVD '" + titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("DVD '" + titulo + "' já está emprestado.");
        }
    }
    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("DVD '" + titulo + "' devolvido com sucesso.");
        } else {
            System.out.println("DVD '" + titulo + "' não estava emprestado.");
        }
    }
}