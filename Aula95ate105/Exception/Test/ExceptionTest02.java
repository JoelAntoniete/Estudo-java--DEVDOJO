package Aula95ate105.Exception.Test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {

        try{
            criarNovoArquivo();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public static void criarNovoArquivo() throws IOException{
        File file  = new File("C:\\Users\\Amand572\\Documents\\Joel\\Dev_Dojo\\Arquivo\\teste.txt");
        file.createNewFile();

    }

    /*
    Uma desvantagem de colococarmos o try catch dentro de um metodos, é que nao damos a oportunidade dele
    ser tratadado de uma maneira diferente quando ele for chamado em alguma classe, assim uma boa pratica é
    usarmos o throws na  chamada do metodo, assim ele lanca o erro para aonde ele foi chamado e quem chamou sera
    responsavel por tratar esse erro.
     */
    private static void criarNovoArquivo2() throws IOException{
        File file  = new File("C:\\Users\\Amand572\\Documents\\Joel\\Dev_Dojo\\Arquivo\\teste.txt");

        try{
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
    /*
    No metodo criarNovoArquivo2 , o professor explica que o metodo de usar apernas o throw na chamada e ideal pra
    metodos publlic, pois voce nao sabe quem esta chamando o metodo e tbem propos essa forma , qua tanto trata o
    a exceção como tbem lanca no console o erro para avisar que apesar de tratado o erro ocorreu.
     */
}
