package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas 4 notas: ");
        String nota1 = scanner.nextLine().replace(",", ".");
        String nota2 = scanner.nextLine().replace(",", ".");
        String nota3 = scanner.nextLine().replace(",", ".");
        String nota4 = scanner.nextLine().replace(",", ".");

        if (Validador.numeroComVirgula(nota1) && Validador.numeroComVirgula(nota2) && Validador.numeroComVirgula(nota3) && Validador.numeroComVirgula(nota4)) {
            double notaNumero1 = Double.parseDouble(nota1);
            double notaNumero2 = Double.parseDouble(nota2);
            double notaNumero3 = Double.parseDouble(nota3);
            double notaNumero4 = Double.parseDouble(nota4);

            double media = (notaNumero1 + notaNumero2 + notaNumero3 + notaNumero4) / 4;
            System.out.println("-------------------");
            System.out.println("Sua média é: " + String.format("%.2f", media));
            if (media >= 7.0) {
                System.out.println("Você está APROVADO.");
            }
            else if (media >= 5.0) {
                System.out.println("Você está em RECUPERAÇÃO.");
            }
            else {
                System.out.println("Você está REPROVADO.");
            }
            System.out.println("-------------------");
        }
        else {
            System.out.println("Campos Inválidos! Tente novamente");
        }
    }
}
