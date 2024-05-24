package atividade11;

public class Exercicio3 {
    public static void main(String[] args) {
    	
        double[] vetor = {1.5, 2.5, 3.5, 4.5, 5.5};
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.println("A média dos elementos é: " + media);
    }
}
