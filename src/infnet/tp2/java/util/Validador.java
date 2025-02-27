package infnet.tp2.java.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validador {
    public static boolean texto(String valor) {
        return valor != null && !valor.isEmpty() && valor.matches("^[A-Za-zÀ-ÖØ-öø-ÿ ]+$");
    }

    public static boolean numero(String valor) {
        return valor != null && !valor.isEmpty() && valor.matches("^[0-9]+$");
    }

    public static boolean numeroComVirgula(String valor) {
        return valor != null && !valor.isEmpty() && valor.matches("^[0-9]+([.][0-9]+)?$");
    }

    public static LocalDate data(String valor) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = null;

        try{
            data = LocalDate.parse(valor, formatter);
        } catch (Exception e) {
            System.out.println("Formato de data inválido!");
        }
        return data;
    }

    public static boolean triaguloValido (double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean frase (String valor) {
        return valor != null && !valor.isEmpty() && valor.matches("^[\\p{L}\\p{N}\\s\\p{P}]+$");
    }
}
