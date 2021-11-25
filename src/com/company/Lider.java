package com.company;

//podemos ver que a classe Lider é instanciada dentro da própria classe
// e o seu construtor está com o modificador private impedindo que
// tentem instanciar uma nova classe através do seu construtor.
//O método obterInstancia garante que sempre se retorne a mesma instância.

public class Lider {
    private String nome;
    private String equipe;

    private Lider(){}
    private static Lider lider = new Lider();
    public static Lider getInstance(){
        return lider;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEquipe(){
        return equipe;
    }

    public void setEquipe(String equipe){
        this.equipe = equipe;
    }

}
