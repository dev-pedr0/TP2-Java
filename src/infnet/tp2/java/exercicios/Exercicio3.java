package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em reais:");
        String inputDinheiro = scanner.nextLine().replace(",", ".");

        System.out.println("Digite a moeda de conversão: dolar / euro / libra:");
        String inputMoeda = scanner.nextLine();

        if (Validador.numeroComVirgula(inputDinheiro) && (inputMoeda.equals("dolar") || inputMoeda.equals("euro") || inputMoeda.equals("libra"))) {
            double dinheiro = Double.parseDouble(inputDinheiro);
            double taxaDolar = 0.1731;
            double taxaEuro = 0.1649;
            double taxaLibra = 0.1368;
            double diheiroConvertido = 0.0;
            String texto = "";

            if (inputMoeda.equals("dolar")) {
                diheiroConvertido = dinheiro * taxaDolar;
                texto = "dolares";
            } else if (inputMoeda.equals("euro")) {
                diheiroConvertido = dinheiro * taxaEuro;
                texto = "euros";
            } else {
                diheiroConvertido = dinheiro * taxaLibra;
                texto = "libras";
            }

            System.out.println("-------------------");
            System.out.println("O valor de " + String.format("%.2f", dinheiro) + " reais, convertido para " + inputMoeda + " resulta no valor de " + String.format("%.2f", diheiroConvertido) + " " + texto + ".");
            System.out.println("-------------------");
        }
        else {
            System.out.println("Campos Inválidos! Tente novamente");
        }
    }
}
