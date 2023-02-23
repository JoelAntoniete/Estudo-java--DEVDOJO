package Aula90ate94.Dominio.repositorio;

public class ReposiorioMemoria implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando na Memória");
    }
}
