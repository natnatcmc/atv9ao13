package atividade11;

public class Exercicio4 {
    public static void main(String[] args) {
    	
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.print("Vetor invertido: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
