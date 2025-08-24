package POO.Casa.Exercicio02.model;

public class Bicicleta extends Veiculo{
    private int numMarchas;
    private boolean bagageiro;

    public Bicicleta(String marca, int qtdRodas, String modelo, int numMarchas, boolean bagageiro){
        super(marca, qtdRodas, modelo);
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }

    public int getNumMarchas() {
        return numMarchas;
    }
    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean getBagageiro(){
        return this.bagageiro;
    }
    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    @Override
    public String imprimirInformacoes(){
        return super.imprimirInformacoes() 
        + ",\n  numeroDeMarchas: " + this.numMarchas
        + ",\n  bagadeiro: " + this.bagageiro;
    }
}
