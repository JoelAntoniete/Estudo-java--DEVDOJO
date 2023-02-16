package Aula80ate83.Test;

import Aula80ate83.Dominio.Cliente;
import Aula80ate83.Dominio.TipoCliente;
import Aula80ate83.Dominio.TipoPagamento;

public class ClienteTeste01 {
    //introdução a Enumeracao

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Roberto", TipoCliente.PESSOA_FISICA,TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Rosangela", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Patricia", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println("-----------------");
        System.out.println(TipoPagamento.CREDITO.calcularDescondo(200));
        System.out.println(TipoPagamento.DEBITO.calcularDescondo(300));
        System.out.println("------------");
        //esse metodo retornara o valor enum refferente ao atributo dele

        System.out.println(TipoCliente.tipoClientePorNomeRelatorio("Pesoa fisica"));
    }
}
