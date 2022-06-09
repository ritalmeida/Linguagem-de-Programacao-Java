package edu.ufp.inf.lp2._01_intro.pl.videoclub;

import java.util.ArrayList;
import java.util.List;

public class Genero {

  private String tipo;
  private ArrayList<Filme> listaFilmes;
  private List<Filme> filmes;

  public Genero(String tipo) {

    this.tipo = tipo;
  }

  public void addFilme(Filme f) {

    listaFilmes.add(f);
  }

  public void removeFilme(Filme f) {

    listaFilmes.remove(f);
  }

}