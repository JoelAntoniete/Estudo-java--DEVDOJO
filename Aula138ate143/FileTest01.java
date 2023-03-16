package Aula138ate143;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        //Podemos passar o Path ou caso queiramos que seja na mesma pasta basta colocarmos o nome do arquivo
        File file = new File("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula138ate\\file.txt");
        try {
            boolean isCreated = file.createNewFile(); //esse metodo retorna um booleano e cria um arquivo caso nao exista
            //file.delete(); //esse metodo retorna um booleano e deleta o arquivo
            System.out.println(isCreated);
            System.out.println("AbsolutePath: " + file.getAbsolutePath()); //retorna o path do arquivo
            System.out.println("path: " + file.getPath()); //retorna o path do arquivo
            System.out.println("is diretorio " + file.isDirectory()); //se o arquivo é um diretorio
            System.out.println("is file "  + file.isFile()); // se é um arquivo




            //exist() retorna um booleano caso o arquivo exista
            if(file.exists()){
                file.delete();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
