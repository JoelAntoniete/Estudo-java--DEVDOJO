package Aula144ate158;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        matches(path1, "glob:**.bkp"); //ele ta dizendo pra ingnorar todio ate o .bkp
        matches(path1,"glob:**/*.{bkp, txt, java}" ); //funciona como um agrupamento
        matches(path1, "glob:**.???");//com os ??? ele ira procurar um arquivo que termine com 3 letras
        matches(path1, "glob:**.file.???");//procura um arquivo com o nome file porem a extenção tem que ter 3 letras


    }
    private static void matches(Path path, String glob){
        //pegamos o Path atraves do sistema operadional usando o FileSystems
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);  //ver a sintaxe do glob
        System.out.println(glob + " : " + matcher.matches(path));
    }
}
