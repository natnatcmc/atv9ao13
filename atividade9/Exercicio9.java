package atividade9;
import java.util.Scanner;

public class Exercicio9 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int maior = Integer.MIN_VALUE;
	        int menor = Integer.MAX_VALUE;

	        while (true) {
	            System.out.print("Digite um valor positivo (ou um valor negativo para encerrar): ");
	            int valor = scanner.nextInt();

	            if (valor >= 0) {
	                if (valor > maior) {
	                    maior = valor;
	                }

	                if (valor < menor) {
	                    menor = valor;
	                }
	            } else {
	                break;
	            }
	        }

	        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
	            System.out.println("Nenhum valor positivo foi informado.");
	        } else {
	            System.out.println("Maior valor informado: " + maior);
	            System.out.println("Menor valor informado: " + menor);
	        }

	        scanner.close();
	    }
}
