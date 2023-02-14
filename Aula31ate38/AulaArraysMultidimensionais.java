package Aula31ate38;

public class AulaArraysMultidimensionais {
    public static void main(String[] args) {
        //primeiro arrays sao os meses
        //segundo array sao  os dias do  mes

        int [][] dias = new int [3][3]; //em arrays multidimensionais a base(primeiro array) tem que definir o tamanho

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0 ; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++ ){
                System.out.println(dias[i][j]);
            }
        }
        /*
        Em arrays multidimensionais, é imoprtante perceber que o primeiro array
        ele tem que ser navegado como um array e apenas o segundo sera navegado
        usando o tipo primitivo
         */
        for (int[] i:dias) {
            for (int num: i) {
                System.out.println(num);
            }
        }

    }
}
