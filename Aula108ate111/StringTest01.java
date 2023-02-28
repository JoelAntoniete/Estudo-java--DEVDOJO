package Aula108ate111;

public class StringTest01 {
    public static void main(String[] args) {
        /*
        Quando criamos uma string no java, ele aloca ela no pool de string e quando criamos uma outra string com o mesmo
        valor, a JVM apenas referencia ele no pool de string com a que ja foi criada ao inves de criar uma outra string igual
         */
        String nome = "William"; //String constant pool
        String nome2 = "William";
        System.out.println(nome == nome2); //dessa forma quando usamos == nos estamos comparando a referencia do objeto e nao so valores

        String nome3 = new String("William");
        System.out.println(nome == nome3);
        //Como criamos um objeto novo com o nome William, ele nao se encotra no pool de string, assim quando comparamos com uma string que esta no pool ele dar falso

        System.out.println(nome == nome3.intern());
        //o intern pega o valor canonico do objeto de string, assimquando comparado ele retorna true





    }
}
