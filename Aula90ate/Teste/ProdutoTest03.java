package Aula90ate.Teste;

import Aula90ate.Dominio.Computador;
import Aula90ate.Dominio.Produto;
import Aula90ate.Dominio.Tomate;
import Aula90ate.Servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000); //É possivel chamar uma classe direto da classe mar
        Tomate tomate = new Tomate("Italiano", 10);
        tomate.setDataValidade("11/12/2023");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(produto);


    }
}
