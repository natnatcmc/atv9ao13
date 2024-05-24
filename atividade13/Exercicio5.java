package atividade13;

public class Exercicio5 {
	
    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(ehBissexto(2020)); 
        System.out.println(ehBissexto(2021)); 
    }
}
