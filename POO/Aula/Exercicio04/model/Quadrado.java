package POO.Aula.Exercicio04.model;

public class Quadrado extends PolReg{
    public Quadrado(int tamanhoDoLado) {
        super(4, tamanhoDoLado);
    }

    @Override
    public double calculoDaArea() {
        return this.getTamanhoDoLado() * this.getTamanhoDoLado();
    }
    
}
