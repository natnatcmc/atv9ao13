package atividade11;

public class Exercicio5 {
    public static void main(String[] args) {
    	
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contagemPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contagemPares++;
            }
        }
        System.out.println("A quantidade de números pares é: " + contagemPares);
    }
}
