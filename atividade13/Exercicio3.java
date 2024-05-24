package atividade13;

public class Exercicio3 {
	
    public static String verificarNumero(int numero) {
    	
        if (numero > 0) {
            return "Positivo";
        } else if (numero < 0) {
            return "Negativo";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        System.out.println(verificarNumero(5));
        System.out.println(verificarNumero(-3));
        System.out.println(verificarNumero(0));
    }
}
