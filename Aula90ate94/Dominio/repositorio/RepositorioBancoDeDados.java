package Aula90ate94.Dominio.repositorio;

public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de dados");
    }
}
