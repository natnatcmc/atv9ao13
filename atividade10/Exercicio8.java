package atividade10;
import java.util.Scanner;

public class Exercicio8 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a base: ");
	        double base = scanner.nextDouble();

	        System.out.print("Digite o expoente: ");
	        int expoente = scanner.nextInt();

	        double resultado = calcularPotencia(base, expoente);

	        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

	        scanner.close();
	    }

	    public static double calcularPotencia(double base, int expoente) {
	        return Math.pow(base, expoente);
	    }
}
