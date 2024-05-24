package atividade13;

public class Exercicio7 {
	
    public static boolean ehPalindromo(String texto) {
    	
        int esquerda = 0;
        int direita = texto.length() - 1;
        
        while (esquerda < direita) {
            if (texto.charAt(esquerda) != texto.charAt(direita)) {
                return false;
            }
            
            esquerda++;
            direita--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ehPalindromo("radar"));
        System.out.println(ehPalindromo("hello"));
    }
}
