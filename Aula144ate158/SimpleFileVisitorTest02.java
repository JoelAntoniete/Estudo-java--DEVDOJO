package Aula144ate158;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        //esse metodo é chamado quandos e entra em um diretorio
        System.out.println("Pré visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        //Se ele tentar abrir um arquivo ele nao tiver permissao ou erro ele lança uma sceção
        //usamos ele exibir ou colocar um logo dizendo que esta tendo um erro
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        //esse metodo é o contrario preVisitDirectory, ele é chamado quando se esta saindo de um arquivo
        System.out.println("Pós visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    //Iremos ver os outros metodos do SimpleFileVisitor

    public static void main(String[] args) throws IOException {
        Path root = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula144ate\\Pasta\\Subpasta");
        Files.walkFileTree(root, new ListAllFiles());


    }
}
