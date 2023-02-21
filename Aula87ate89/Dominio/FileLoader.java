package Aula87ate89.Dominio;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {

    }
}
