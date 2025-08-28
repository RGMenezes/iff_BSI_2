package POO.Aula.Exercicio03.model;

public class CD extends Midia{
    private int nMusicas;
    
    public CD(){
        super();
    }

    public CD(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public int getnMusicas() {
        return nMusicas;
    }
    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    public String getDetalhes(){
        return super.getDetalhes() + "\nNumero de musicas: " + this.getnMusicas();
    }
    public String getTipo(){
        return this.getClass().getSimpleName();
    }

    public void inserirDados(int codigo, double preco, String nome, int nMusicas){
        super.inserirDados(codigo, preco, nome);
        this.setnMusicas(nMusicas);
    }
}
