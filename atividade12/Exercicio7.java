package atividade12;

public class Exercicio7 {
    public static boolean ehBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ehBissexto(2020)); 
        System.out.println(ehBissexto(2021)); 
    }
}
