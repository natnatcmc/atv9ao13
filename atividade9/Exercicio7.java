package atividade9;
import java.util.Scanner;

public class Exercicio7 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int totalValores = 0;
	        int soma = 0;
	        int valor;

	        do {
	            System.out.print("Digite um valor (ou um valor negativo para encerrar): ");
	            valor = scanner.nextInt();

	            if (valor >= 0) {
	                totalValores++;
	                soma += valor;
	            }
	        } while (valor >= 0);

	        if (totalValores > 0) {
	            double media = (double) soma / totalValores;
	            System.out.println("Total do somatório: " + soma);
	            System.out.println("Média aritmética: " + media);
	            System.out.println("Total de valores lidos: " + totalValores);
	        } else {
	            System.out.println("Nenhum valor foi informado.");
	        }

	        scanner.close();
	    }
}
