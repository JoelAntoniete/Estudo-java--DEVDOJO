package Aula48ReverMaterial.Teste;

import Aula48ReverMaterial.Dominio.Estudante;
import Aula48ReverMaterial.Dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "João";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        // System.out.println(estudante01.nome);
        // System.out.println(estudante01.idade);
        // System.out.println(estudante01.sexo);
        // System.out.println("--------------------------");
        // System.out.println(estudante02.nome);
        // System.out.println(estudante02.idade);
        // System.out.println(estudante02.sexo);

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
