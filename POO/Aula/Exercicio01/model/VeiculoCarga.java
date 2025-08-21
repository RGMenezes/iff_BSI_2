package POO.Aula.Exercicio01.model;

public class VeiculoCarga extends Veiculo {
    private int capacidadeMax;

    public VeiculoCarga(String placa, String marca, String modelo, String ano, double valorKmRodado, int capacidadeMax){
        super(placa, marca, modelo, ano, valorKmRodado);
        this.capacidadeMax = capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }
    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    
}
