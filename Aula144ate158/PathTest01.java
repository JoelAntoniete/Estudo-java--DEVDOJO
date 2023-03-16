package Aula144ate158;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        //Introdrução a new input output NIO

        //com esse metodo pegamos um Path
        Path p1 = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula138ate143\\file.txt");

        System.out.println(p1.getFileName());//pegamos o nome do arquivo apartir do path
        System.out.println(p1.toFile()); //podemos transformar esse arquivo em um file
        System.out.println(p1.toFile().toPath());//atravez de um file podemos egar um path tbem

        //temos outras formas de pegar o path de um arquivo

        //podemos pegar o path como se forsse um varargs
        Path p2 = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula138ate143","file.txt");
        Path p3 = Paths.get("C:","Users","User","Documents","Curso_Udemy_Java","DevDojo","src","Aula138ate143","file.txt");

        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());


    }
}
