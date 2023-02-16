package Aula71ate75.Teste;

import Aula71ate75.Dominio.Funcionario;

public class HerancaTest02 {
    //Sequência de inicialização
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Roberto");

        //0 - Bloco de inciaçlização estatico da super classe executado quando a JVM carrega a classe pai
        //1 - Bloco de inicialização estatico da subclasse  e executado quando a JVM carrega a classe filha
        //2 - Alocado espaco em memoria pro objeto da superclasse
        //3 - Cada atributo de superclasse é criado e inicializado com valores default ou que for passado
        //4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
        //5 - Construtor é executado da superclasse
        //6 - Alocado espaco em memoria pro objeto da superclasse
        //7 - Cada atributo  de superclasse é criado e inicializado com valores default ou o que for passado
        //8 - Bloco de inicializaçao da subclasse é executado na ordem em que aparece
        //9 - Construtor é executado da subclasse
    }
}
