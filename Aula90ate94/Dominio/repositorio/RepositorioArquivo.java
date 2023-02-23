package Aula90ate94.Dominio.repositorio;

public class RepositorioArquivo implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando em um Arquivo");
    }
}
