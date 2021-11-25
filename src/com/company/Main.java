package com.company;

//nosso caso é uma aplicação de cadastro de uma equipe de desenvolvedores
// e uma das regras de negócios é: existe apenas um lider de equipe na equipe(classe que nomearemos como 'Lider');
// Com o padrão Singleton podemos evitar que sejam instanciados dois objetos da classe Lider
public class Main {

    public static void main(String[] args) {
        Lider lider1, lider2, lider3;
        //lider1 = new Lider(); Não permite instanciar, contrutor privado

        lider2 = Lider.getInstance();
        lider2.setNome("Camila021");
        lider2.setEquipe("equipe azul");
        lider3 = Lider.getInstance();

        if(lider2 == lider3){
            System.out.println("Mesmo lider");
            System.out.println("Nome do lider 2 = " + lider2.getNome());
            System.out.println("Nome do lider 3 = " + lider3.getNome());
        }
    }
}
