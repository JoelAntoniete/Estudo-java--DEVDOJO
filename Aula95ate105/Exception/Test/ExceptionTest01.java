package Aula95ate105.Exception.Test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file  = new File("C:\\Users\\Amand572\\Documents\\Joel\\Dev_Dojo\\Arquivo\\teste.txt");

        try{
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace(); //imprime a stack no console
        }

    }
}
