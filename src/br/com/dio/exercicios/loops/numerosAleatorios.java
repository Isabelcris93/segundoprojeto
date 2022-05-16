package br.com.dio.exercicios.loops;

import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];
        int i;
       
        for (i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }
        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
            
        }
        System.out.println(" Sucessores de Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }
        System.out.println(" Antecessores de Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero-1) + " ");
        }

    }
}
