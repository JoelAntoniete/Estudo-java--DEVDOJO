package Aula138ate143;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula138ate\\file.txt");
        try (FileWriter fw = new FileWriter(file,true);){

            //podemos criar um arquivo direto do fileWriter ou pegar uma arquivo ja existente e colocar
            //caso coloquemos um true na chamada do file write nos colocamos a funcao append
            //a funcao append, caso escrevemos nova informacao ela adiciona ao texto
            // o chamado sem o true, ela exclui o que foi escrito no arquivo e reescreve do zero


            fw.write("Teste de escrita usando a classe FileWrite");
            fw.flush(); // apos escrever ele encerra o buffer

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(file.getAbsolutePath());
    }
}
