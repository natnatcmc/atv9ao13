package atividade10;

public class Exercicio11 {
    public static void main(String[] args) {
        long fatorialImpares = 1;

        for (int i = 1; i <= 10; i += 2) {
            fatorialImpares *= calcularFatorial(i);
        }

        System.out.println("O fatorial dos valores ímpares de 1 a 10 é: " + fatorialImpares);
    }

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
