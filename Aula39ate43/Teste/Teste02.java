package Aula39ate43.Teste;

import Aula39ate43.Dominio.Estudante;

public class Teste02 {
    public static void main(String[] args) {

        //conceito de criar varios instancias de objetos com a mesma classe
        Estudante estudante = new Estudante();

        estudante.nome = "João";
        estudante.idade = 32;
        estudante.sexo = 'M';

        Estudante estudante2 = new Estudante();

        estudante2.nome = "Maria";
        estudante2.idade = 23;
        estudante2.sexo = 'F';


    }
}
