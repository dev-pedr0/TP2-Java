package infnet.tp2.java.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Tente adivinhar o número que eu pensei! É um número de 1 a 100");

        int numeroSorteado = rand.nextInt(100) + 1;
        int palpite = 0;
        boolean palpiteCorreto = false;

        while (!palpiteCorreto) {
            System.out.println("\nDigite seu palpite:");
            palpite = scanner.nextInt();

            if (palpite == 999) {
                break;
            }

            if (palpite == numeroSorteado) {
                palpiteCorreto = true;
                System.out.println("Você acertou! O número era: " + numeroSorteado);
            } else if (palpite > numeroSorteado) {
                System.out.println("Seu palpite foi muito alto! O número correto é menor!");
                System.out.println("Continue tentando, masse quiser parar digite 999.");
            } else {
                System.out.println("Seu palpite foi muito baixo! O número correto é maior!");
                System.out.println("Continue tentando, mas se quiser parar digite 999.");
            }
        }

    }
}
