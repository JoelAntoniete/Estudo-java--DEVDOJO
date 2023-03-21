package Aula90ate.Dominio;

public class Tomate extends Produto{
    public static double IMPOSTO = 0.05;
    private String dataValidade; //data de validade nao sera visualizada pela classe Produto, no exemplo do test02 aula 91
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto tomate...");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
