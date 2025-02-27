package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma data do seu aniversário no formato (dd/MM/yyyy): ");
        LocalDate dataAniversario = Validador.data(scanner.nextLine());
        LocalDate hoje = LocalDate.now();

        long diferencaDias = ChronoUnit.DAYS.between(dataAniversario, hoje);
        System.out.println("Você tem " + diferencaDias + " dias de idade.");
    }
}
