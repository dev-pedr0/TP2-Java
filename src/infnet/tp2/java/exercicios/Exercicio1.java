package infnet.tp2.java.exercicios;

import infnet.tp2.java.util.Validador;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        String idade = scanner.nextLine();

        System.out.println("Digite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine();

        System.out.println("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();

        if(Validador.texto(nome) && Validador.numero(idade) && Validador.texto(nomeMae) && Validador.texto(nomePai)) {
            System.out.println("------------------------");
            System.out.println("Seu dados são:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Nome da Mãe: " + nomeMae);
            System.out.println("Nome do Pai: " + nomePai);

            if (nome.length() > nomeMae.length()) {
                System.out.println("Seu nome é maior que o nome da sua mãe.");
            }
            if (nome.length() > nomePai.length()) {
                System.out.println("Seu nome é maior que o nome do seu pai.");
            }
            System.out.println("------------------------");
        }
        else {
            System.out.println("Campos Inválidos! Tente novamente");
        }
    }
}
