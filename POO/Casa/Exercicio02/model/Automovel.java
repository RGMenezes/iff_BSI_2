package POO.Casa.Exercicio02.model;

public class Automovel extends Veiculo{
    private double potenciaDoMotor;

    public Automovel(String marca, int qtdRodas, String modelo, double potenciaDoMotor){
        super(marca, qtdRodas, modelo);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public double getPotenciaDoMotor() {
        return potenciaDoMotor;
    }
    public void setPotenciaDoMotor(double potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    @Override
    public String imprimirInformacoes(){
        return super.imprimirInformacoes() 
        + ",\n  potenciaDoMotor: " + this.potenciaDoMotor;
    }
}
