package Aula48ReverMaterial56.Teste;

import Aula48ReverMaterial56.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        //Modificador de acesso private, get e set

        Pessoa pessoa = new Pessoa();

        //pessoa.nome = "João";
        //pessoa.idade = 25;

        pessoa.setNome("João");
        pessoa.setIdade(25);

        pessoa.imprime();

    }
}
