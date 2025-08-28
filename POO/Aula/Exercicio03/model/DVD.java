package POO.Aula.Exercicio03.model;

public class DVD extends Midia{
    private int nFaixas;
    
    public DVD(){
        super();
    }

    public DVD(int codigo, double preco, String nome, int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }

    public int getnFaixas() {
        return nFaixas;
    }
    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    public String getDetalhes(){
        return super.getDetalhes() + "\nNumero de faixas: " + this.getnFaixas();
    }
    public String getTipo(){
        return this.getClass().getSimpleName();
    }

    public void inserirDados(int codigo, double preco, String nome, int nFaixas){
        super.inserirDados(codigo, preco, nome);
        this.setnFaixas(nFaixas);
    }
}
