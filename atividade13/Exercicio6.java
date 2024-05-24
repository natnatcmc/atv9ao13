package atividade13;

public class Exercicio6 {
	
    public static int calcularMaximo(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        System.out.println(calcularMaximo(3, 5));
        System.out.println(calcularMaximo(10, 7));
    }
}
