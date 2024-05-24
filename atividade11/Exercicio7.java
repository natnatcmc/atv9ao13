package atividade11;

import java.util.Arrays;

public class Exercicio7 {
    public static void main(String[] args) {
    	
        int[] vetor = {5, 2, 8, 3, 1, 4};
        Arrays.sort(vetor);
        System.out.print("Vetor ordenado em ordem crescente: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
