package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        String numero = scanner.nextLine();
        System.out.println("\nDigite um incremento: ");
        String incremento = scanner.nextLine();

        if (Validador.numero(numero) && Validador.numero(incremento)) {
            int numeroInt = Integer.parseInt(numero);
            int incrementoInt = Integer.parseInt(incremento);

            System.out.println("\n------------------");
            System.out.print(numeroInt+", ");
            while (numeroInt < 100) {
                numeroInt += incrementoInt;
                if (numeroInt < 100) {
                    System.out.print(numeroInt+", ");
                }
                else {
                    System.out.print(numeroInt+".");
                }
            }
            System.out.println("\n------------------");
        } else {
            System.out.println("Campos Inválidos! Tente novamente");
        }
    }
}
