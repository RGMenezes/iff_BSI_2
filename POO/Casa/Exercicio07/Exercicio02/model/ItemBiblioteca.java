package POO.Casa.Exercicio07.Exercicio02.model;

public abstract class ItemBiblioteca {
    protected String titulo;
    protected int ano;
    protected boolean emprestado;

    public ItemBiblioteca(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
}