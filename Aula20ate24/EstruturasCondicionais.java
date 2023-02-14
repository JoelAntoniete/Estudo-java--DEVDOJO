package Aula20ate24;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        //----if----

        /*if(true){
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");

         */

        int idade = 20;

        //podemos colocar uma variavel booleana como parametro pro if tbem.
        //boolean isAutorizadoAComprarBebidaAlcolica = idade >= 18;

        if (idade >= 18){
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        //----else----

        if (idade >= 18){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida");
        }


        //----else if----

        //Categoria time de futebol:
        //idade < 15 infantil
        //idade >= 15 && idade < 18 juvenil
        //idade > 18 adulto

        int idadeTime= 16;
        String categoria;

        if (idadeTime < 15){
            categoria ="Infatil";
        } else if (idadeTime >= 15 && idadeTime < 18) {
            categoria = "Juvenil";
        }else{
            categoria ="Adulto";
        }

        System.out.println("Sua categoria é " + categoria);


        //----Operador Ternario---

        double salario = 6000;
        String mensagemDoar = "irei fazer uma doacao";
        String mensagemNaoDoar = "nao  irei doar";
        String resultado;


        //Sintaxe do operador ternario = (condicao) ? (verdadeiro) : (falso);

        resultado = salario >= 5000? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        //--Exercicio imposto de reda--
        double valorSalario = 2500;
        String taxa;

        if(valorSalario < 1903.99){
            taxa = "Você esta isento do imposto";
        } else if (valorSalario >= 1903.99 && valorSalario <2826.65) {
            taxa = "Sua porcentagem é de 7,5% e o valor é de R$142,80";
        } else if (valorSalario >= 2826.65 && valorSalario < 3751.05) {
            taxa = "Sua porcentagem é de 15% e o valor é de R$354,80";
        } else if (valorSalario >= 3751.06 && valorSalario < 4664.68 ) {
            taxa = "Sua porcentagem é de 22,5% e o valor é de R$636,13";
        } else{
            taxa = "sua porcentagem é de 27,5% e o valor é de R$ 869,36";
        }
        System.out.println(taxa);

    }


}
