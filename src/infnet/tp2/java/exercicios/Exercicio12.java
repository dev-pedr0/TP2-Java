package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        if (Validador.frase(frase)) {
            String[] palavras = frase.split(" ");

            int contagem = 0;
            for (String palavra : palavras) {
                contagem++;
            }
            System.out.println("\n--------------------");
            System.out.println("A frase escrita foi: " + frase);
            System.out.println("Essa frase tem " + contagem + " palavras.");
            System.out.println("--------------------");
        } else {
            System.out.println("Campos Inválidos! Tente novamente");
        }
    }
}
