package Aula64ate70.ExercicioAssociacao;

public class Seminario {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void imprime(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Local: "+local.getEndereco());
        if(estudantes != null){
            for (Estudante estudante : estudantes) {
                System.out.println("Estudante: "+estudante.getNome());
            }

        }
    }
}
