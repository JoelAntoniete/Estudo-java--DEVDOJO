package Aula87ate89.Dominio;

public interface DataLoader{

    public static final int INT_MAX_SIZE = 10; //todos os atributos sao padrao public static final
    void load(); //na interface, todos os metodos sao publicos e abstratos, assim nao é necessario escrever

    default void checkPermission(){
        System.out.println("Chegando permissao....");
    }
    /*
    Caso queiramos criar um metodo com implementação , e necessario colocar
    o default no metodo. e ele nao é obrigatorio a implementacao nas classes filhas
     */
}
