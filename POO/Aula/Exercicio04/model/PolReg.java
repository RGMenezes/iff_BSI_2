package POO.Aula.Exercicio04.model;

public abstract class PolReg {
    protected int numeroDeLados, tamanhoDoLado;

    public PolReg(int numeroDeLados, int tamanhoDoLado) {
        this.numeroDeLados = numeroDeLados;
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public int getNumeroDeLados() {
        return numeroDeLados;
    }
    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public int getTamanhoDoLado() {
        return tamanhoDoLado;
    }
    public void setTamanhoDoLado(int tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public double calculoDoPerimetro() {
        return numeroDeLados * tamanhoDoLado;
    }

    public double calculoDoAnguloInterno() {
        return (numeroDeLados - 2) * 180 / numeroDeLados;
    }

    public abstract double calculoDaArea();
}