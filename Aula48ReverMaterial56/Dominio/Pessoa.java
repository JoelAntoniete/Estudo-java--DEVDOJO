package Aula48ReverMaterial.Dominio;

public class Pessoa {
    private String nome;
    private int idade;
    //private, so podemos acessar ele dentro do objeto
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade< 0){
            System.out.println("Não pode haver idade negativa");
            return;
        }
        this.idade = idade;
    }
}
