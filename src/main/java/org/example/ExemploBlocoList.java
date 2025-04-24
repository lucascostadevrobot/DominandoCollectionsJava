package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExemploBlocoList {
    public static void main(String[] args) {

        //Exemplo de Exercicio do Gato
        ArrayList<Gato> objetoGatoDados = new ArrayList<>(){{
            add(new Gato("Mufasa", 3, "Branco Gelo", "Original"));
            add(new Gato("Simba", 4, "Preto", "Simbiose"));
            add(new Gato("Luc", 10, "Cinza", "SpiderMan"));
        }};

        int count = 0;
        //Exibe em ordem aleatoria
        Collections.shuffle(objetoGatoDados);
        for (Gato gato : objetoGatoDados){
            count++;
            System.out.println("Esse é o " + (count - 1) +  " gato:  " +  gato);

        }
    }
}
