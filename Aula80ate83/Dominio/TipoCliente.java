package Aula80ate83.Dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");


    public final int VALOR;
    public final String nomeRelatorio;

    //esse é um metodo pra buscar atributos em uma enumeracao
    public static TipoCliente tipoClientePorNomeRelatorio(String nome){
        for (TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nome)){
                return tipoCliente;
            }
        }
        return null;
    }
    TipoCliente(int valor, String nome) {
        this.VALOR = valor;
        this.nomeRelatorio = nome;
    }
    /*
    Podemos colocar atributos na enueração, porem assim é preciso criar um construtor
    e criar uma variavel aonde ficara armazenado,  o  valor é atribuido quando o cliente
    escolhe o tipo de pagamento. aula82
     */

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
