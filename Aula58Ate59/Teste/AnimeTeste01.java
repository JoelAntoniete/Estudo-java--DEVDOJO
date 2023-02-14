package Aula58Ate59.Teste;


import Aula58Ate59.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        //Construtor e sobrecarga de construtor

        Anime anime = new Anime("Akudama Drive", "Tv", "Ação",12);
        Anime anime2 = new Anime("Naruto", "TV","Ação",1000,"Estudio novo");



        anime.imprime();
        anime2.imprime();
    }
}
