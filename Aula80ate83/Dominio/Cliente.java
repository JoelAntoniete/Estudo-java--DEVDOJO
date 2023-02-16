package Aula80ate83.Dominio;

public class Cliente {

    //É possovel criar um enum dentro da classe como um atributo
    /*public enum TipoPagamento{
        DEBITO, CREDITO
    }*/
    private String nome;
    private TipoCliente tipoCliente;
    //Lembrar que apesar de criar o enum na classe temos que instancia-la
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoCliente int=" + tipoCliente.VALOR +
                '}';
    }
}
