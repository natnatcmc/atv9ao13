package atividade13;

public class Exercicio10 {
	
    public static boolean ehPrimo(int numero) {
    	
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ehPrimo(7));
        System.out.println(ehPrimo(10));
    }
}
