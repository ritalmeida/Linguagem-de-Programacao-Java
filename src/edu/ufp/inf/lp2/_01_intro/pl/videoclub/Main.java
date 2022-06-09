package edu.ufp.inf.lp2._01_intro.pl.videoclub;

public class Main {

    public static void main(String[] args) {

        /**
         * criar "bases" para o filme Titanic
         */
        Filme titanic = new Filme("Titanic");
        Genero drama = new Genero("Drama");
        Ator ator = new Ator("Leonardo DiCaprio");
        Ator atriz = new Ator("Kate Winslet");

        titanic.addAtor(ator);
        titanic.addAtor(atriz);
        titanic.addGenero(drama);

        System.out.println("Ficha tecnica do filme " + titanic + ": ");
        System.out.println("Atores: ");
        titanic.listarAtores();
        System.out.println("Genero: ");
        titanic.listarGeneros();
    }
}
