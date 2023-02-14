package Aula31ate38;

public class AulaArrayMultidimensionais2 {
    public static void main(String[] args) {
        //Inicializacoes de arrays multidimensionais
        int[][] arrayInt = new int[3][];

        //podemos inicializar sem valor
        //arrayInt[0] = new int[];

        //podemos inicializar ja com valor
        arrayInt[0] = new int[]{1,2};
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        //podemos inicializar com valores desta forma
        int[][] arrayInt2 = {{1,2},{1,2,3},{1,2,3,4,5,6}};

        for (int[]arrBase : arrayInt ){
            System.out.println("-----");
            for (int num:arrBase) {
                System.out.println(num + " ");
            }
        }
    }
}
