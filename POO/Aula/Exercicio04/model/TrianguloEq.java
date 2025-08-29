package POO.Aula.Exercicio04.model;

public class TrianguloEq extends PolReg{
    public TrianguloEq(int tamanhoDoLado) {
        super(3, tamanhoDoLado);
    }

    @Override
    public double calculoDaArea() {
        return (Math.sqrt(3) / 4) * this.getTamanhoDoLado() * this.getTamanhoDoLado();
    }
}
