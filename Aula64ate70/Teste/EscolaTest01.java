package Aula64ate70.Teste;

import Aula64ate70.Dominio.Escola;
import Aula64ate70.Dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        //Associação unidirecional muitos para um
        Professor professor1 = new Professor("Roberto");
        Professor professor2 = new Professor("Laura");


        Professor[] professores= {professor1, professor2};
        Escola escola = new Escola("USP", professores);

        escola.imprime();
    }
}
