package Aula144ate158;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path>{
    //criamos um padrao na qual vamos submeter os nomes do arquivos
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        //aplicamos o padrao, que ira retornar true caso o nome do arquivo tenha passado no teste
        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcheTest02 {
    //Exercicio, buscar todos os arquivos Test das pastas
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src");
        Files.walkFileTree(root, new FindAllTestJavaOrClass());

    }
}
