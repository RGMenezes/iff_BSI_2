package POO.Aula.Exercicio04.model;

public class Aluno extends Pessoa {
    private String nomeDoCurso;

    public Aluno(String nome, int idade, String nomeDoCurso) {
        super(nome, idade);
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Curso: " + nomeDoCurso);
    }
}
