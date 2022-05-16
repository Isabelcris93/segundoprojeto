package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;

        int nota;

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        int maior = 0;
        int soma = 0;

        int count = 0;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Nota: ");
            nota = scan.nextInt();

            while (nota < 0 | nota > 10) {
                System.out.println("Nota Inválida ! Digite novamente: ");
                nota = scan.nextInt();
                System.out.println("Continue aqui...");

            }
            do {
                System.out.println("Número: ");
                numero = scan.nextInt();

                soma = soma + numero;

                if (numero > maior) maior = numero;

                count = count + 1;
            } while (count < 5);


            do {
                System.out.println("Quantidade de Numeros: ");
                quantNumeros = scan.nextInt();
                System.out.println("Número: ");
                numero = scan.nextInt();

                if (numero % 2 == 0) quantPares++;
                else quantImpares++;

                count++;
            } while (count < quantNumeros);

            System.out.println("Quantidade de Pares:" + quantPares);
            System.out.println("Quantidade de Impares:"  + quantImpares);
            System.out.println("Maior: " + maior);
            System.out.println("Media: " + (soma / 5));
            System.out.println("Continua aqui...");
        }
    }
}