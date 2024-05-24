package atividade11;

public class Exercicio2 {
    public static void main(String[] args) {
    	
        int[] vetor = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }
}
