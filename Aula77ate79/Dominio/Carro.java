package Aula77ate79.Dominio;

public class Carro {
    private String nome;


    /*
    Quando colocamos associamos um final a um objeto, quando nos instanciarmos
    esse objeto ele jamais podera ser redefinido, porem seus dados podem ser
    alterados.
     */
    public final Comprador COMPRADOR= new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }
    public static final double VELOCIDADE_LIMITE = 250;  //temos sempre que atribuirmos um valor a uma constante

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
