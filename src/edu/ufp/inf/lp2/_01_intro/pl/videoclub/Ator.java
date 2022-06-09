package edu.ufp.inf.lp2._01_intro.pl.videoclub;

import java.util.ArrayList;

public class Ator {

  private String nome;
  private int nPremios;
  private ArrayList<Filme> filmes;

  public Ator(String nome) {

    this.nome = nome;
    this.nPremios = 0;
    this.filmes = new ArrayList<>();
  }

  public Ator(String nome, int p) {

    this.nome = nome;
    this.nPremios = p;
    this.filmes = new ArrayList<>();
  }

  public void incPremios(Integer n) {

    this.nPremios += n;
  }

  public String getNome() {

    return nome;
  }

  public void setNome(String nome) {

    this.nome = nome;
  }
}