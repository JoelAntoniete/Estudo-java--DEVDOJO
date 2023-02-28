package Aula108ate111;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        String nome = "William";
        nome.concat(" DevDojo");
        System.out.println(nome);

        //a stringBuilder ela nao tem o conceito de imutabilidade, ja que ela nao é uma string e sim uma classe que trabaçha com as string
        StringBuilder sb = new StringBuilder("William"); //ele tem o tamanho padrao de 16 porem ele aumenta sozinho
       // System.out.println(sb.toString()); //a Stringbuilder retorna uma StringBuilder e nao uma strng
        sb.append(" Devdojo").append(" Academy");//concatenar varias strings
        sb.reverse();  //revertte a ordem
        sb.reverse();
        sb.delete(0,3);  //deleta os caracteres entre 0 e 3
        System.out.println(sb);

    }
}
