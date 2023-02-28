package Aula71ate;

import Aula71ate.Dominio.Endereco;
import Aula71ate.Dominio.Funcionario;
import Aula71ate.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        //Herança
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Principal");
        endereco.setCep("012345-678");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Roberto");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("123.456.789-10");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Rau");
        funcionario.setCpf("109.876.543-21");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500.00);

        funcionario.imprime();

    }
}
