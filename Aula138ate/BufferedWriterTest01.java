package Aula138ate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        //a classe fileWrite é uma classe lo level, assim foi desenvolvido BufferedWriter que é mais performatico


        File file = new File("C:\\Users\\User\\Documents\\Curso_Udemy_Java\\DevDojo\\src\\Aula138ate\\file.txt");
        //fileWrite recebe um arquivo no contrutor, uma bufferredWriter recebe um fileWriter no construtor
        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter bf = new BufferedWriter(fw)){
            //com um BufferdWriter alem de gravarmos o texto no arquivo, nos iremos gravar em um buffer, sendo muito performatico

            bf.write("Teste de escrita usando a classe FileWrite");
            bf.newLine(); //para criarmos novas linhas, ja que nem todos sistemas operacionais reconhecem o \n
            bf.flush(); // apos escrever ele encerra o buffer

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
