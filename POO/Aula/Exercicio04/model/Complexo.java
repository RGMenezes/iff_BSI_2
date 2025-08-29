package POO.Aula.Exercicio04.model;

public class Complexo {
    protected double real, imag;

    public Complexo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double modulo() {
        return Math.sqrt((real * real) + (imag * imag));
    }

    public double angulo(){
        return Math.atan2(imag, real) * 180 / Math.PI;
    }
}
