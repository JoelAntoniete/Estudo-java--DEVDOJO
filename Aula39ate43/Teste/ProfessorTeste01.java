package Aula39ate43.Teste;

import Aula39ate43.Dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        /*
        na aula 41 foi explicado a idea de coesao e a importancia de temos
        classes separadas pra funcoes diferentes.
         */

        Professor professor = new Professor();
        professor.nome = "William";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println( professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
