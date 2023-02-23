package Aula95ate105.Test;

import Aula95ate105.Dominio.Funcionario;
import Aula95ate105.Dominio.LoginInvalidoException;
import Aula95ate105.Dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();


        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
