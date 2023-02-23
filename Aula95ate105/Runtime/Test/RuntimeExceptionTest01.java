package Aula95ate105.Runtime.Test;

public class RuntimeExceptionTest01 {
    /*Checked = Exceções que sao checadas sao filhas da classe Exception diretamente, e se nao tratadas elas
    lançarao um erro em tempo de compilação.

    Unchecked = Exceções nao checadas sao filhas da classe RuntimeExcception, que quando lançadas o erro provavelmente
    é do dev que nao tratou as excceçoes.
    */

    public static void main(String[] args) {
        Object object = null;
        System.out.println(object.toString()); //NullPointerException

        int[] nums = {1,2};
        System.out.println(nums[2]); //ArrayIndexOutOfBoundsException
    }




}