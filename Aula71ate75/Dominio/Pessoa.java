package Aula71ate75.Dominio;

public class Pessoa {
    protected String nome;
    protected String Cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização static de Pessoa");
    }
    {
        System.out.println("Dentro do bloco inicializaão nao estatico Pessoa");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

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
