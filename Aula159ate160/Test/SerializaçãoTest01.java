package Aula159ate160.Test;

import Aula159ate160.Dominio.Aluno;
import Aula159ate160.Dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializaçãoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1,"William Suane", "12345");
        Turma turma = new Turma("DevDojo"); //como turma nao é serializavel, nao podemos serializar
        aluno.setTurma(turma);
        serializar(aluno);
        //deserializar();

    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("C:\\Users\\Amand572\\Documents\\Joel\\Dev_Dojo\\src\\Aula144ate158\\Pasta\\Subpasta\\SubSubPasta\\aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
            System.out.println(aluno);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void deserializar(){
        Path path = Paths.get("C:\\Users\\Amand572\\Documents\\Joel\\Dev_Dojo\\src\\Aula144ate158\\Pasta\\Subpasta\\SubSubPasta\\aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno =(Aluno) ois.readObject();
            System.out.println(aluno);

        }catch (IOException |ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
