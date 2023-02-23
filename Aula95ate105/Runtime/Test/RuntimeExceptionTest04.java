package Aula95ate105.Runtime.Test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
   //Capturando multiplas exceções
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException"); //É indicdo no final colocarmos uma exceçõa mais generica no final
            /*
           É indicado colocarmos uma excceção mais generica no final, assim caso ele nao se adeque as excecoes
           mais expecificas a cima, ele ira chamar a mais generica que esta no final.
             */
        }

        //Multi catch
        /*
        Essa sintaxe nos diz que podemos colocar exeções que nao estao na mesma linha de herança dentro de um
        mesmo catch separados via pipe (|)
         */
        try {
            talvesLanceException();
        }catch (FileNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    private static void talvesLanceException() throws SQLException, FileNotFoundException{
        //poddivel colar mais de uma exeção na chamada
    }


}
