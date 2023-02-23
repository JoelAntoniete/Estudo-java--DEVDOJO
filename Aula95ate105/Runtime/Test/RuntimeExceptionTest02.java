package Aula95ate105.Runtime.Test;

public class RuntimeExceptionTest02 {
    //Lançando exceções
    public static void main(String[] args) {
        try{
            divisao(1,0);
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }
    //colocar o throws na assinatura do metodos, avisa os outros dev que esse metodo pode lacao uma esceção, basta colocolar o mouse no nome do metodo que foi chamado
    //caso a exceção seja  checked, quando colocarmos o throws , seria obrigatorio o uso do try e cach, assim como é para criacao de arquivos
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
       return a / b;
    }
}
