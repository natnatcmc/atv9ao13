package atividade12;

public class Exercicio8 {

    public static long calcularPotencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(calcularPotencia(2, 3));
    }
}
