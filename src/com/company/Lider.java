package com.company;

//podemos ver que a classe Lider é instanciada dentro da própria classe
// e o seu construtor está com o modificador private impedindo que
// tentem instanciar uma nova classe através do seu construtor.
//O método obterInstancia garante que sempre se retorne a mesma instância.

public class Lider {
    private String nome;

    private Lider(){}
    private static Lider lider = new Lider();
    public static synchronized Lider obterInstancia(){
        return lider;
    }

    public String obterNome(){
        return lider.nome;
    }

    public void setarNome(String nome){
        this.nome = nome;
    }
}
