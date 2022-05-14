package br.com.dio.exercicios.loops.model;

import java.util.Scanner;

public class tabuada {

        public static class Tabuada {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.println("Tabuada: ");
                int tabuada = scan.nextInt();

                for (int i = 1; i <= 100; i++) {
                    System.out.println(tabuada + " x " + i + " = " + (tabuada * i));

                }
                System.out.println("Fatorial: ");
                int fatorial = scan.nextInt();

                int multiplicacao = 1;

                System.out.println(fatorial + "! = ");
                for (int i = fatorial; i >= 1; i--) {
                    multiplicacao = multiplicacao * i;
                }

                System.out.println(multiplicacao);

            }
        }
    }

