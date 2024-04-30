package atividade9;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaFatoriais = 0;
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            int valor = scanner.nextInt();
            somaFatoriais += calcularFatorial(valor);
        }
        
        System.out.println("O total do somatório da fatorial dos valores lidos é: " + somaFatoriais);
        
        scanner.close();
    }
    
    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

}
