package Aula87ate89.Dominio;

public class DataBaseLoader implements DataLoader, DataRemove{

    //Interfaces  - Introdução
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados......");
    }
    /*
    Uma vez implementada uma interface na classe ela serve como
     um contrato, e é obrigatorio seus metodos
     */

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados....");
    }
}
