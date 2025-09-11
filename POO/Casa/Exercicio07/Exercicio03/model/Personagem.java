package POO.Casa.Exercicio07.Exercicio03.model;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void atacar(Personagem alvo) {
        int dano = this.ataque - alvo.defesa;
        if (dano > 0) {
            alvo.vida -= dano;
            System.out.println(this.nome + " atacou " + alvo.nome + " causando " + dano + " de dano.");
        } else {
            System.out.println(this.nome + " atacou " + alvo.nome + " mas não causou dano.");
        }
    }

    public void defender() {
        System.out.println(this.nome + " está se defendendo.");
    }

    public String getTipo() {
        return "Personagem";
    }
}
