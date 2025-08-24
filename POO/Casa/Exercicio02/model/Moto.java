package POO.Casa.Exercicio02.model;

public class Moto extends Automovel{
    private boolean partidaEletrica;

    public Moto(String marca, int qtdRodas, String modelo, double potenciaDoMotor, boolean partidaEletrica){
        super(marca, qtdRodas, modelo, potenciaDoMotor);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String imprimirInformacoes() {
        return super.imprimirInformacoes()
        + ",\n  partidaEletrica: " + this.partidaEletrica;
    }
}
