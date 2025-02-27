package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 3 lados de um triângulo:");
        String ladoa = scanner.nextLine().replace(",", ".");;
        String ladob = scanner.nextLine().replace(",", ".");;
        String ladoc = scanner.nextLine().replace(",", ".");;

        if(Validador.numeroComVirgula(ladoa) && Validador.numeroComVirgula(ladob) && Validador.numeroComVirgula(ladoc)) {
            double valora = Double.parseDouble(ladoa);
            double valorb = Double.parseDouble(ladob);
            double valorc = Double.parseDouble(ladoc);

            if (Validador.triaguloValido(valora, valorb, valorc)) {
                if (valora == valorb && valora == valorc) {
                    System.out.println("Triângulo Equilátero");
                } else if (valora == valorb || valora == valorc || valorb == valorc) {
                    System.out.println("Triângulo Isóceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            }
            else {
                System.out.println("Lados inválidos para um triângulo!");
            }
        }
        else {
            System.out.println("Campos Inválidos! Tente novamente");
        }
    }
}
