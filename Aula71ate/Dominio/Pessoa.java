package Aula71ate.Dominio;

public class Pessoa {
    private String nome;
    private String Cpf;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.Cpf);
        System.out.println(endereco.getRua() + " " + endereco.getCep());
    }
}
