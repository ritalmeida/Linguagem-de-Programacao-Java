package edu.ufp.inf.lp2._01_intro.pl.videoclub;

import java.util.ArrayList;
import java.util.Date;

public class Filme {

  private String titulo;
  private Genero genero;
  private Date ano;
  private ArrayList<Ator> atores;
  private ArrayList<Genero> generos;

  public Filme(String titulo) {

    this.titulo = titulo;
    atores = new ArrayList<>();
    generos = new ArrayList<>();
  }

  public void addGenero(Genero g) {

    generos.add(g);
  }

  public void removeGenero(Genero g) {

    generos.remove(g);
  }

  public void addAtor(Ator a) {

    atores.add(a);
  }

  public void removeAtor(Ator a) {

    atores.remove(a);
  }

  public void listarAtores() {

    System.out.println(atores);
  }

  public void listarGeneros() {

    System.out.println(generos);
  }
}