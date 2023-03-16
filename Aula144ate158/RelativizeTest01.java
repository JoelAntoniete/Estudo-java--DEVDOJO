package Aula144ate158;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        //de maneira simplificada, relativize e um meio de vc chegar no path2 a partir do path1
        Path dir = Paths.get("/home/William");
        Path clazz = Paths.get("/home/William/dev/arquivo.txt");

        //ele mostra como chegar do arquivo class apartir do arquivo dir
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/William");
        Path absoluto2 = Paths.get("/usr/loca");
        Path absoluto3 = Paths.get("/home/William/devDojo/ola_mundo.txt");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        System.out.println("4 " + relativo2.relativize(relativo1));
        //nao usar caminhos absolutos com caminhos relativos

    }
}
