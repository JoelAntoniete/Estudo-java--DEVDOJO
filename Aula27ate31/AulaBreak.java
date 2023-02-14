package Aula27ate31;

public class AulaBreak {
    public static void main(String[] args) {
        //imprimia os 25 primeiros numeros de uma serie de 50

        for(int i = 0;  i < 50;  i++){
            System.out.println(i);
            if(i >= 25) break;
        }
    }
}
