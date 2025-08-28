package POO.Aula.Exercicio02.model;

public abstract class Produto {
    protected String numeroSerie, nome;
    protected double preco;

    public Produto(String numeroSerie, String nome) {
        this.numeroSerie = numeroSerie;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public abstract double calcularPrecoFinal();
}