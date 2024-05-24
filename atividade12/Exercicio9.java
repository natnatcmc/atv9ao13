package atividade12;

public class Exercicio9 {

    public static boolean ehTriangulo(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        System.out.println(ehTriangulo(3, 4, 5));
        System.out.println(ehTriangulo(1, 1, 2));
    }
}
