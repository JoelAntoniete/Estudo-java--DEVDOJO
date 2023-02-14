package Aula57Ate.Teste;

import Aula57Ate.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        //Sobrecarga de metodos

        Anime anime = new Anime();
        Anime anime2 = new Anime();

        anime.init("Akudama Drive", "Tv", 12);
        anime2.init("Naruto", "TV","Ação",1000);

        anime.imprime();
    }
}
