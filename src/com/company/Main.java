package com.company;


public class Main {

    public static void main(String[] args) {
        Lider  lider2;

        lider2 = Lider.getInstance();
        lider2.setNome("Camila021");
        lider2.setEquipe("equipe azul");

            System.out.println("Nome do lider 2 = " + lider2.getNome());

    }
}
