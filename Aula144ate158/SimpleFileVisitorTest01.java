package Aula144ate158;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path> {
    //criamos uma clase com um generic paths, assim todos os metodos que tem <t> ele sera Path
    //depois sobreescrevemos o metodo visitFile

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        //Um desafio do professor é listar apenas os arquivos que terminam com (.java)
        if(file.getFileName().toString().endsWith(".java")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
        //dar uma olhada nas constantes do FileVisitResult, pois cada uma tem uma funcao diferente
        //CONTINUE ele apos encontrar a pasta ele continua a busca
        //TERMINATE apos ele encontrar a pastra ele finaliza
        //SKIP_SUBTREE quando ele acha uma pasta ele mostra tbem todos as subpastas
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src");
        Files.walkFileTree(root, new ListJavaFiles());
        //pra usar esse metodo ele pede um ath aonde comecar e um SimpleFileVisitor
        //pra mostrar como ele deve acessar esses arquivos


    }
}
