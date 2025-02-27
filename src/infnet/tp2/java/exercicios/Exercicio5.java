package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.util.Scanner;

import java.util.Locale;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da compra:");
        String inputCompra = scanner.nextLine().replace(",", ".");

        if (Validador.numeroComVirgula(inputCompra)){
            double valorCompra = Double.parseDouble(inputCompra);
            double valorFinal = 0.0;
            double desconto = 0.0;
            if (valorCompra > 1000.00) {
                desconto = 0.90;
                valorFinal = valorCompra * desconto;
            } else if (valorCompra >= 500.00) {
                desconto = 0.95;
                valorFinal = valorCompra * desconto;
            } else {
                desconto = 0.0;
                valorFinal = valorCompra;
            }
            System.out.println("-------------------");
            System.out.println("O valor da compra é: " + valorCompra + " reais.");
            System.out.println(
                    (1 - desconto) == 1 ? "Nenhum desconto foi aplicado." : "O desconto aplicado é de: " + String.format(Locale.US,  "%.2f", (1 - desconto)*100.00) + "%"
            );
            System.out.println("O valor final é de: " + String.format(Locale.US, "%.2f", valorFinal) + " reais.");
            System.out.println("-------------------");
        }
        else {
            System.out.println("Campos Inválidos! Tente novamente");
        }
    }
}
