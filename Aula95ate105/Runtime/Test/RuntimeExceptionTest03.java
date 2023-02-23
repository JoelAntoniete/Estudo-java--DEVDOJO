package Aula95ate105.Runtime.Test;

public class RuntimeExceptionTest03 {
    //bloco finally
    public static void main(String[] args) {

        //Exemplo de como funcionaria um finally em um sistema de arquivp

        abreConexao();
    }
    public static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Excrevendo dados no arquivo");
            return "Conexão aberta";

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando arquivo"); //Ele executa tendo um erro ou nao.
        }
        return null;
    }
    public static void abreConexao2() {
        //Podemos usar o try finally
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Excrevendo dados no arquivo");

        }finally {
            System.out.println("Fechando arquivo"); //Ele executa tendo um erro ou nao.
        }
    }

}
