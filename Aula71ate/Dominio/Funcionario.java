package Aula71ate.Dominio;

public class Funcionario extends Pessoa {
    private double salario;

    // Super
    public void imprime(){
        super.imprime();// a funcao super execulta o imprime da classe pessoa
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
