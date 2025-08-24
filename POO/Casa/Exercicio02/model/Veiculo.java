package POO.Casa.Exercicio02.model;

public class Veiculo {
    private String marca, modelo;
    private int qtdRodas, velocidade = 0;

    public Veiculo(String marca, int qtdRodas, String modelo){
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int valor){
        this.velocidade += valor;
    }
    public void desacelerar(int valor){
        this.velocidade -= valor;
    }

    public String imprimirInformacoes(){
        return "\n  marca: " + this.marca
        + ",\n  modelo: " + this.modelo
        + ",\n  quantidadeDeRodas: " + this.qtdRodas
        + ",\n  velocidade: " + this.velocidade;
    }
}
