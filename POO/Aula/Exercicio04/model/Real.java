package POO.Aula.Exercicio04.model;

public class Real extends Complexo {
    public Real(double real) {
        super(real, 0);
    }

    public int sinal(){
        return this.getReal() >= 0 ? 1 : -1;
    }
}
