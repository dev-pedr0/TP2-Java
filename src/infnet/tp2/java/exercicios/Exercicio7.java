package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário bruto anual:");
        String inputSalario = scanner.nextLine();

        if(Validador.numeroComVirgula(inputSalario)){
            double salarioBruto = Double.parseDouble(inputSalario);
            double aliquota = 0.0;
            double imposto = 0.0;
            double salarioLiquido = 0.0;

            if (salarioBruto <= 27870.40) {
                aliquota = 0.0;
                imposto = salarioBruto * aliquota;
                salarioLiquido = salarioBruto - imposto;
            } else if (salarioBruto > 27870.40 && salarioBruto <= 37751.55) {
                aliquota = 0.075;
                imposto = salarioBruto * aliquota;
                salarioLiquido = salarioBruto - imposto;
            } else if (salarioBruto > 37751.55 && salarioBruto <= 50148.25) {
                aliquota = 0.15;
                imposto = salarioBruto * aliquota;
                salarioLiquido = salarioBruto - imposto;
            } else if (salarioBruto > 50148.25 && salarioBruto <= 64259.59) {
                aliquota = 0.225;
                imposto = salarioBruto * aliquota;
                salarioLiquido = salarioBruto - imposto;
            } else {
                aliquota = 0.275;
                imposto = salarioBruto * aliquota;
                salarioLiquido = salarioBruto - imposto;
            }

            System.out.println("----------------------");
            System.out.println("Seu salário bruto anual é de: " + String.format(Locale.US, "%.2f", salarioBruto) + " reais.");
            System.out.println("A aliquota é de " + String.format(Locale.US, "%.2f", (aliquota*100)) + " %.");
            System.out.println("O imposto anual cobrado é de: " + String.format(Locale.US, "%.2f", imposto) + " reais.");
            System.out.println("Seu salário líquido é de: " + String.format(Locale.US, "%.2f", salarioLiquido) + " reais.");
            System.out.println("----------------------");
        }
        else {
            System.out.println("Campos Inválidos! Tente novamente");
        }
    }
}
