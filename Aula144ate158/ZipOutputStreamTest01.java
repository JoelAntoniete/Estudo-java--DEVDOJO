package Aula144ate158;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        //como zipar uma pasta

        Path arquivoZip = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\Pasta\\Subpasta\\SubSubPasta\\arquivo.zip");
        Path arquivosParaZipar = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\home\\William\\dev");
        zip(arquivoZip,arquivosParaZipar);


    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar){
        //newOutputStream ele pega um path e retorna um outputStream
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)){

            //usamos o directoryStream ele navega pelo diretorios, etemos que colocar o outputStream
            for(Path file: directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString()); //temos que preparar a entrada
                zipStream.putNextEntry(zipEntry); //zipamos
                Files.copy(file, zipStream);//copiar tudo que esta no arquivo para o zip
                zipStream.closeEntry(); //fechamos
            }

            System.out.println("Arquivo Zipado");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}


