package POO.Aula.Exercicio02.model;

public class Nacional extends Produto {
    private String uf;
    private String situacao;

    public Nacional(String numeroSerie, String nome, String uf) {
        super(numeroSerie, nome);
        this.uf = uf;
        this.situacao = "Disponivel";
    }

    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public double calcularPrecoFinal(){
        if(this.preco <= 0) throw new IllegalArgumentException("Preco deve ser maior que zero");
        return this.preco * 1.1;
    }

    @Override
    public String toString() {
        return "Nacional [numeroSerie=" + numeroSerie + ", nome=" + nome + ", preco=" + preco + ", uf=" + uf + ", situacao=" + situacao + "]";
    }
}