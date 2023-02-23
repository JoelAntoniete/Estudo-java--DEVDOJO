package Aula90ate94.Teste;

import Aula90ate94.Dominio.repositorio.ReposiorioMemoria;
import Aula90ate94.Dominio.repositorio.Repositorio;
import Aula90ate94.Dominio.repositorio.RepositorioArquivo;
import Aula90ate94.Dominio.repositorio.RepositorioBancoDeDados;

public class RepositorioTest01 {
    //Programação orientada a interface
    public static void main(String[] args) {
        RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
        repositorioBancoDeDados.salvar();

        //Programacao orientada a interface
        Repositorio repositorio = new RepositorioArquivo();
        Repositorio repositorio1 = new ReposiorioMemoria();
        Repositorio repositorio2 = new RepositorioBancoDeDados();

        repositorio.salvar();
        repositorio1.salvar();
        repositorio2.salvar();

    }
}
