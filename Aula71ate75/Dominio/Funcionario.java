package Aula71ate75.Dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização static de Funcionario");
    }
    {
        System.out.println("Dentro do bloco inicializaão nao estatico do funcionario");
    }

    public Funcionario(String nome){
        super(nome);//como a classe Pessoa tem um construtor, e necessario criar um construtor e chamar o super
        System.out.println("Dentro do construtor de funcionario");
    }

    // Super
    public void imprime(){
        super.imprime();// a funcao super execulta o imprime da classe pessoa
        System.out.println(this.salario);
    }
    //introdução a protected, mostra que apesr de estar protegida elas sao publicas para as subclasses
    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome + "recebi o salario de " + this.salario
        );
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
