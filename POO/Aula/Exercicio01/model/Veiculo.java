package POO.Aula.Exercicio01.model;

public class Veiculo{
    protected String placa, marca, modelo, ano;
    protected int kmRodado, kmInicial;
    protected double valorAlacacaoKM;
    protected boolean disponibilidade;

    public Veiculo(String placa, String marca, String modelo, String ano, double valorAlacacaoKM){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorAlacacaoKM = valorAlacacaoKM;
        this.kmInicial = this.kmRodado = 0; 
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }

    public String alocar(){
        if(!this.disponibilidade) return "Veiculo indisponivel para alocação.";
        this.disponibilidade = false;
        this.kmInicial = kmRodado;
        return "Veiculo alocado com sucesso";
    }

    public String devolver(int kmFinal){
        if(this.disponibilidade) return "Veiculo não alocado.";

        this.disponibilidade = true;
        int kmRodadoNaAlocacao = calcularKmRodado(this.kmInicial, kmFinal);
        this.kmRodado += kmRodadoNaAlocacao;

        return String.format("Valor a pagar R$%,2f", this.calcularValor(kmRodadoNaAlocacao));
    }

    private int calcularKmRodado(int kmInicial, int kmFinal){
        if(kmInicial > kmFinal) throw new ArithmeticException("Km inicial é maior que km final!");
        return kmFinal - kmInicial;
    }

    private double calcularValor(int kmRodado){
        return kmRodado * this.valorAlacacaoKM;
    }
}