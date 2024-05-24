package atividade11;

public class Exercicio10 {
	
    public static void main(String[] args) {
    	
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        int[] vetorUnido = new int[vetor1.length + vetor2.length];
        for (int i = 0; i < vetor1.length; i++) {
            vetorUnido[i] = vetor1[i];
        }
        for (int i = 0; i < vetor2.length; i++) {
            vetorUnido[vetor1.length + i] = vetor2[i];
        }
        System.out.print("Vetor unido: ");
        for (int i = 0; i < vetorUnido.length; i++) {
            System.out.print(vetorUnido[i] + " ");
        }
    }
}
