package Aula39ate43.Teste;

import Aula39ate43.Dominio.Estudante;

public class Test01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Joel";
        estudante.idade = 27;
        estudante.sexo ='M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
