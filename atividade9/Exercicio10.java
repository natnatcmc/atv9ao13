package atividade9;
import java.util.Scanner;

public class Exercicio10 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o dividendo: ");
	        int dividendo = scanner.nextInt();

	        System.out.print("Digite o divisor: ");
	        int divisor = scanner.nextInt();

	        int quociente = calcularQuociente(dividendo, divisor);

	        System.out.println("Resultado da divisão inteira: " + quociente);

	        scanner.close();
	    }

	    public static int calcularQuociente(int dividendo, int divisor) {
	        int quociente = 0;
	        int resto = dividendo;

	        while (resto >= divisor) {
	            resto -= divisor;
	            quociente++;
	        }

	        return quociente;
	    }
}
