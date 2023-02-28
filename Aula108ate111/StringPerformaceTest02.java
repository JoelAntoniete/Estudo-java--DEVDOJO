package Aula108ate111;

public class StringPerformaceTest02 {
    public static void main(String[] args) {
        Long inicio = System.currentTimeMillis();
        //concatString(100000);
        concatStringBuilder(1000000);
        Long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder: " + (fim - inicio) + "ms");

        Long inicio1 = System.currentTimeMillis();
        concatString(100000);
        Long fim1 = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim1 - inicio1) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    //StringBuildder ela tem melhor performace
    private static void concatStringBuilder(int tamanho) {
        StringBuilder texto = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }

    // identico ao stringBuilder podrem, a string buffer foi criado pra ambiente multitread
    private static void concatStringBuffer(int tamanho) {
        StringBuffer texto = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }
}
