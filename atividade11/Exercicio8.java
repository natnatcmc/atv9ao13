package atividade11;

public class Exercicio8 {
    public static void main(String[] args) {
    	
        int[] vetor = {1, 2, 3, 4, 5};
        int elementoProcurado = 3;
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elementoProcurado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Elemento " + elementoProcurado + " encontrado no vetor.");
        } else {
            System.out.println("Elemento " + elementoProcurado + " não encontrado no vetor.");
        }
    }
}
