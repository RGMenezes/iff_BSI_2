package POO.Aula.Exercicio02.model;

public class Importado extends Produto{
    private String origem;
    
    public Importado(String numeroSerie, String nome, String origem) {
        super(numeroSerie, nome);
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double calcularPrecoFinal(){
        if(this.preco <= 0) throw new IllegalArgumentException("Preco deve ser maior que zero");
        return this.preco * 1.3;
    }
    
    @Override
    public String toString() {
        return "Importado [numeroSerie=" + numeroSerie + ", nome=" + nome + ", preco=" + preco + ", origem=" + origem + "]";
    }
}
