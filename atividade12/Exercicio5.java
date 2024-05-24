package atividade12;

public class Exercicio5 {

    public static String inverter(String texto) {
        StringBuilder sb = new StringBuilder(texto);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(inverter("hello"));
        
    }
}
