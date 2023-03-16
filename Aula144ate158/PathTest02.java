package Aula144ate158;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class PathTest02 {
    public static void main(String[] args) {

        // pegar o path aonde o arquivo sera criado
        Path pastaPath = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\Pasta");
        try {
            //é necessario usar o files pra criar um direttorio, porem usamos isso no path
            //Path directory = Files.createDirectory(pastaPath); //caso o arquivo ja exista ele lança uma exceção

            //checar se o arquivo exista caso queiramos criar um novao
            if(Files.notExists(pastaPath)){
               Path directory = Files.createDirectory(pastaPath);
            }


            //criar arquivos com subpasta
            Path subPastaPath = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\Pasta\\Subpasta\\SubSubPasta");
            Path subdirectory = Files.createDirectories(subPastaPath); //caso as pastass filhas nao existam ele ira cria-las
            //para criar um directory com subpastas usamos o createDirectories nao o createDirectory

            //criar um arquivo
            Path path = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\Pasta\\Subpasta\\SubSubPasta\\file.txt");
            if(Files.notExists(path)){
                Path filePathCreated = Files.createFile(path);
            }

            //renomear um arquivo dentro de um direttorio

            Path source = path; //origem

            //o metodo getParente, ele retorna o path ate o diretorio pai em que se encontra o arquivo, ou seja, ate a pasta SubSubPasta
            Path target = Paths.get(path.getParent().toString(), "file_renamed.txt"); //destino
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING); //metodo Stadard colocado, ele nao so copia o arquivo como tbem copia o que esta no arquivo



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class BasicFileAttributeTest02 {
        public static void main(String[] args) throws IOException {

            //rever aula 150
            Path path = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\home\\William\\novo_Path.txt");
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

            FileTime creationTime = basicFileAttributes.creationTime();
            FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
            FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

            System.out.println("creationTime :" + creationTime);
            System.out.println("lastModifiedTime :" + lastModifiedTime);
            System.out.println("lastAccessTime :" + lastAccessTime);

            BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
            FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
            fileAttributeView.setTimes(lastModifiedTime,newCreationTime,creationTime);

            creationTime = fileAttributeView.readAttributes().creationTime();
            lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
            lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

            System.out.println("creationTime :" + creationTime);
            System.out.println("lastModifiedTime :" + lastModifiedTime);
            System.out.println("lastAccessTime :" + lastAccessTime);
        }
    }
}
