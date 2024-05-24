package atividade11;

import java.util.HashMap;

public class Exercicio6 {
    public static void main(String[] args) {
    	
        int[] vetor = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        HashMap<Integer, Integer> frequencia = new HashMap<>();
        for (int i = 0; i < vetor.length; i++) {
            if (frequencia.containsKey(vetor[i])) {
                frequencia.put(vetor[i], frequencia.get(vetor[i]) + 1);
            } else {
                frequencia.put(vetor[i], 1);
            }
        }
        for (int key : frequencia.keySet()) {
            System.out.println("Elemento " + key + " aparece " + frequencia.get(key) + " vezes.");
        }
    }
}
