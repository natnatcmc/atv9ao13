package atividade10;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.println("Conversão de Celsius para Fahrenheit:");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (9.0 * celsius + 160.0) / 5.0;
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        }
    }
}
