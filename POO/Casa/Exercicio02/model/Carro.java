package POO.Casa.Exercicio02.model;

public class Carro extends Automovel{
    private int qtdPortas;

    public Carro(String marca, int qtdRodas, String modelo, double potenciaDoMotor, int qtdPortas){
        super(marca, qtdRodas, modelo, potenciaDoMotor);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public String imprimirInformacoes() {
        return super.imprimirInformacoes()
        + ",\n  qtdPortas: " + this.qtdPortas;
    }
}

