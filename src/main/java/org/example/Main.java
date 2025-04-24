package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    /**
     * Faça um programa que leia um vetor de 6 caracteres,
     * e diga quantas consoantes foram lidas.
     * E imprima as consoantes
     */
    public static void main(String[] args) {

        //Instancia a Classe Scanner do Java
        Scanner ler = new Scanner(System.in);
        String[] consoantesPadrao = {"B", "C", "F", "G", "J", "K", "L", "M", "N", "P", "Q", "R", "R", "S", "T", "V", "W", "X", "Z"};
        String[] consoantes = new String[6];
        for (int i = 0;i < consoantes.length ; i++) {
            System.out.println("Digite o caractere de número: " + (i + 1) + ":");
            String letraDigitada = ler.next().toUpperCase(Locale.ROOT);
            if (Arrays.asList(consoantesPadrao).contains(letraDigitada)) {
                consoantes[i] =  letraDigitada;
            }else {
                consoantes[i] =  "NÃO É CONSOANTE";
            }
        }
        System.out.println("Então as consotantes digitadas foram: " + Arrays.toString(consoantes));
    }
}
