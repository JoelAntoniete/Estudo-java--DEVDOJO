package Aula144ate158;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        //normalização
        String diretorioProjeto = "C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\William";
        String diretorioTxt = "../../arquivo.txt"; //podemos usar o ./ tbem

        //no linux temos essa forma de voltar diretorios, com o normalize ele reconhece essa comando de voltar as pastas
        Path path1 = Paths.get(diretorioProjeto, diretorioTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());

    }
}
