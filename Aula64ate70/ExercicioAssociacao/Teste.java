package Aula64ate70.ExercicioAssociacao;

public class Teste {
    /*
    O sistema evera cadastrar seminarios, estudantes, professores e local aonde sera realizado

    Um aluno podera estar em apenas um seminario
    Um seminario podera ter nenhum oy varios alunos
    Um Professor podera varios seminarios
    Um seminanio pode ter um locall

    Campos basicos
    seminario: titulo
    aluno: nome e idade
    professor: nome, especialidade
    local: endereco
     */
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante("Roberto", 17);
        Estudante estudante02 = new Estudante("Juliana", 20);
        Estudante estudante03 = new Estudante("Mariana", 16);

        Seminario seminario1 = new Seminario("Saude");
        Seminario seminario2 = new Seminario("Esporte");

        Professor professor1 = new Professor("Marcos", "Edicador Fisico");

        Local local = new Local("São Paulo");


        estudante01.setSeminario(seminario1);
        estudante02.setSeminario(seminario2);
        estudante03.setSeminario(seminario1);

        Estudante[] alunos1 = {estudante01,estudante03};
        Estudante[] alunos2 = {estudante02};
        seminario1.setEstudantes(alunos1);
        seminario1.setEstudantes(alunos2);


        Seminario[]seminarios = {seminario1,seminario2};
        professor1.setSeminarios(seminarios);


        seminario1.setLocal(local);
        seminario2.setLocal(local);

        System.out.println("--- Alunos ---");
        estudante01.imprime();
        estudante02.imprime();
        estudante03.imprime();

        System.out.println("--- Professores ---");
        professor1.imprime();

        System.out.println("--- Seminario ---");
        seminario1.imprime();
        seminario2.imprime();


    }
}
