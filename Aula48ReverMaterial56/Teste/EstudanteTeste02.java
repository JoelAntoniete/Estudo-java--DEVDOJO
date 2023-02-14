package Aula48ReverMaterial56.Teste;

import Aula48ReverMaterial56.Dominio.Estudante;
import Aula48ReverMaterial56.Dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
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


        //Estamos pegando informacao do proprio objeto
        estudante01.imprime();
        estudante02.imprime();
    }
}
