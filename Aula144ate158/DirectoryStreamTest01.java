package Aula144ate158;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) {
        //DirectoruStream é uma maneira muito simples de fazer uma busca de diretorios
        //muito semelhante ao comando dir

        Path dir = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src");

        //DirectoryStream ele é closeblçe, sendo necessario usar o metodo close()
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            //sendo o Stream um interator é necessario interarmos para termos todos os paths dos arquivos
            for (Path path:stream) {
                System.out.println(path.getFileName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
