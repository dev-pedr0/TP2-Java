package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        String ano = scanner.nextLine();

        if (Validador.numero(ano)) {
            int anoNumero = Integer.parseInt(ano);

            if (Year.of(anoNumero).isLeap()) {
                System.out.println(ano + " é um ano bissexto.");
            }
            else {
                System.out.println(ano + " não é um ano bissexto.");
            }
        }
        else {
            System.out.println("Campos Inválidos! Tente novamente");
        }
    }
}
