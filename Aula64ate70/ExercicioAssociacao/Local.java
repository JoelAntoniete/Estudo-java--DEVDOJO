package Aula64ate70.ExercicioAssociacao;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("Local: "+endereco);
    }
}
