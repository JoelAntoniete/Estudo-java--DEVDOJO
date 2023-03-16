package Aula144ate158;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributeTest01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttribute  usa o polimorfismo pra trabalhar com o sistema operacional
        //DosFileAttribute é uma implementacao do BasicFile porem com mais funções pro windows
        //PosixFileAttribute é uma implementação do BasicFile com mais funcoes pro linux
        LocalDateTime date = LocalDateTime.now().minusDays(10); 
        
        //azer a modificação da data de mmodificacao do arquivo  usando o File
        File file = new File("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\home\\William\\novo.txt");
        boolean isCreated = file.createNewFile();
        //Aqui ele cria um arquivo com a data de modificacao a 10 dias atras
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());
        
        //Fazer modificacao da data de modificação usando o Path
        Path path = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\home\\William\\novo_Path.txt");
        Path file1 = Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        //Para modificar é necessario passar um path e um FileTime
        Files.setLastModifiedTime(path,fileTime);

        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));


    }
}
