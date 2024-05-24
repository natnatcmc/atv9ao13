package atividade12;

public class Exercicio10 {
	
    public static double calcularMediaPonderada(double[] valores, double[] pesos) {
    	
        if (valores.length != pesos.length) {
            throw new IllegalArgumentException("Os arrays de valores e pesos devem ter o mesmo tamanho.");
        }
        double somaValores = 0;
        double somaPesos = 0;
        for (int i = 0; i < valores.length; i++) {
            somaValores += valores[i] * pesos[i];
            somaPesos += pesos[i];
        }
        return somaValores / somaPesos;
    }

    public static void main(String[] args) {
        double[] valores = {3.0, 4.0, 5.0};
        double[] pesos = {1.0, 2.0, 3.0};
        System.out.println(calcularMediaPonderada(valores, pesos)); 
    }
}
