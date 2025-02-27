package infnet.tp2.java.exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastre sua senha:");
        String senha = scanner.nextLine();

        String senha2 = "";
        boolean senhaValida = false;
        while (!senhaValida) {
            System.out.println("Digite sua senha novamente: ");
            senha2 = scanner.nextLine();
            if (senha2.equals(senha)) {
                senhaValida = true;
                System.out.println("Senha correta!");
            } else {
                System.out.println("Senha incorreta!");
            }
        }
    }
}
