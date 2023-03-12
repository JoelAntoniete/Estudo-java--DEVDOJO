package Aula138ate;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula138ate\\file.txt");
        try (FileReader fr = new FileReader(file)){
            System.out.println(fr.read()); //ele retorna um in, referente a tabela asci do primeiro digito do arquivo
            /*
            char[] in = new char[30];
            fr.read(in);
            for(char c : in){
                System.out.println(c);
                }
                essa é uma maneira bem simplificade de fazer a leitura do arquivo
             */

            int i;
            //quando chega no final do arquivo, o fileReader retorna -1
            while((i = fr.read()) != -1){
                System.out.print((char) i); //temos que fazer um cast pra char, pois o file reader retorna um int referente ao caracter asci
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
