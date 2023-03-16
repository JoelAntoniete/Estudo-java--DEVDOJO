package Aula138ate143;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        //Diretorios
        File diretorio = new File("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula138ate\\pasta");
        boolean mkdir = diretorio.mkdir();//criar um diretorio
        System.out.println(mkdir);

        //criar arquivo dentro do diretorio

        File fileArquivo = new File("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula138ate\\pasta\\arquivo.txt");
        //Podemos criar um arquivo usando o nome da variavel do diretorio como referencia
        //File fileArquivo2 = new File(diretorio, "Arquivo.txt");

        try {
            fileArquivo.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //renomear um arquivo
        File fileRenamed = new File(diretorio,"arquivo_renomeado.txt");  //aqui colocamos o diretorio na chama do metodo, para colocar o novo arquivo ja no diretorio
        fileArquivo.renameTo(fileRenamed); // precisamos pegar o arquivo com nome antigo e usar o metodo renameTo(), e colocar o nome do novo arquivo

        //renomear diretorio
        File diretorioRenamed  = new File("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula138ate\\diretorio_renomeado");
        diretorio.renameTo(diretorioRenamed);

    }
}
