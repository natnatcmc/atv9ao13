package atividade9;

public class Exercicio11 {
	public static void main(String[] args) {
        int soma = 0;
        int contador = 0;

        for (int i = 50; i <= 70; i++) {
            if (i % 2 == 0) {
                soma += i;
                contador++;
            }
        }

        double media = (double) soma / contador;

        System.out.println("Total da soma dos valores pares de 50 a 70: " + soma);
        System.out.println("Média aritmética dos valores pares de 50 a 70: " + media);
    }
}
