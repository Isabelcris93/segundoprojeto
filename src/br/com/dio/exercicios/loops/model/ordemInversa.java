package br.com.dio.exercicios.loops.model;

public class ordemInversa {
    public static void main(String[] args) {

        int [] vetor = {-5, -6, 15, 50, 4 };


        //System.out.println(vetor.length);

        System.out.println("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {
        System.out.println(vetor[count] + " " );
        count++;
    }
        System.out.println("Vetor 2: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " " );

    }
}
}
