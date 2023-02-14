package Aula48ReverMaterial.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario != null) {
            for (Double i : salario) {
                System.out.println(i);
            }
        }

    }

    public void media() {
        double soma = 0;
        if (salario != null) {
            for (double i : salario) {
                soma += i;
            }
        }
        System.out.println(soma / this.salario.length);
    }


}
