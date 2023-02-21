package Aula84ate86.Domain;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    //introdução a metodos abstratos
    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
