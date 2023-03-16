package Aula144ate158;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("Aula144ate158/home/William"); //podemos pegar os paths fragmentados
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo); //aqui nos usamos o metodo resolve
        System.out.println(resolve);
        //Aula144ate\home\William\dev\arquivo.txt da mesma forma que o path raiz


        Path absoluto = Paths.get("/home/William");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("arquivo.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));

    }
}
