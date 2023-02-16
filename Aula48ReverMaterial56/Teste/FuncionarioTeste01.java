package Aula48ReverMaterial56.Teste;

import Aula48ReverMaterial56.Dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario.nome = "Joao";
        funcionario.idade = 16;
        funcionario.salario = new double[]{1200,987.32,2000};

        funcionario.media();
        funcionario.imprime();







    }
}
