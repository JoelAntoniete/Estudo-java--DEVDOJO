package Aula84ate.Test;

import Aula84ate.Domain.Funcionario;
import Aula84ate.Domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        //Introdução a Classes abstratas
        //Funcionario funcionario = new Funcionario("Pedro", 2000);
        Gerente gerente = new Gerente("Pietro", 20000);

        //System.out.println(funcionario);
        System.out.println(gerente);

    }
}
