package atividade10;

public class Exercicio9 {
    public static void main(String[] args) {
        int termos = 15;
        int anterior = 0;
        int atual = 1;

        System.out.println("Série de Fibonacci até o décimo quinto termo:");

        for (int i = 1; i <= termos; i++) {
            System.out.print(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}