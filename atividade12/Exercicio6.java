package atividade12;

public class Exercicio6 {

    public static int contarVogais(String texto) {
        int contagem = 0;
        String vogais = "aeiouAEIOU";
        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) != -1) {
                contagem++;
            }
        }
        return contagem;
    }

    public static void main(String[] args) {
        System.out.println(contarVogais("hello")); // 2
    }
}
