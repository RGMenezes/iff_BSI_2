package POO.Casa.Exercicio06.model;

public abstract class Personagem {
    private String nome;
    private int pontosVida;

    public Personagem(String nome, int pontosVida) {
        this.nome = nome;
        this.pontosVida = pontosVida;
    }

    public Personagem() {
        
    }

    public abstract void atacar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }
    
}

// - Classe Abstrata Personagem
//  • Atributos:
//  - String nome
//  - int pontosVida
//  • Métodos:
//  - abstract void atacar()
//  - String getNome(), void setNome(String nome)
//  - int getPontosVida(), void setPontosVida(int pontosVida)