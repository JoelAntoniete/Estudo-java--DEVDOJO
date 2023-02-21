package Aula87ate89.Teste;

import Aula87ate89.Dominio.DataBaseLoader;
import Aula87ate89.Dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();// não é necessario a implementação na classe
    }
}
