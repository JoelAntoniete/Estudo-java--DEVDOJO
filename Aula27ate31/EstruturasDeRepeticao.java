package Aula27ate31;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while, do while, for

        //----while----
        int count = 0;
        while(count < 10){
            System.out.println(++count);


        }
        // ----do while----
        int valor = 0;

        do {
            System.out.println("do-while   " + ++valor);
        }while (valor < 10);

        //----for----
        for (int i = 0; i < 10; ++i){
            System.out.println("for  " + i);
        }
    }
}
